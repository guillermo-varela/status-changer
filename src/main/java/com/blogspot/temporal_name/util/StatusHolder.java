/*
Copyright (C) 2015 - Guillermo Varela

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package com.blogspot.temporal_name.util;

public class StatusHolder {

    private static volatile Status currentStatus = Status.UP;

    public static enum Status {
        UP, DOWN;
    }

    public static Status getCurrentStatus() {
        return currentStatus;
    }

    public static synchronized void setCurrentStatus(Status currentStatus) {
        StatusHolder.currentStatus = currentStatus;
    }

    /**
     * Allows changing the current status of this application instance.
     * 
     * @return Current status after the change.
     */
    public static synchronized Status toggleStatus() {
        if (currentStatus == Status.UP) {
            currentStatus = Status.DOWN;
        } else {
            currentStatus = Status.UP;
        }
        return currentStatus;
    }
}
