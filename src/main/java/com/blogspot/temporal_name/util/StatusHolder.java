/*
Copyright 2015 Guillermo Varela

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
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
