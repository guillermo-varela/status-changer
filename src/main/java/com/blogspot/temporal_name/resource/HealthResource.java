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
package com.blogspot.temporal_name.resource;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.blogspot.temporal_name.util.StatusHolder;

@Path("/health")
@Produces(MediaType.TEXT_PLAIN)
public class HealthResource {

    /**
     * Gets the current status of this application instance.
     * 
     * @return Current status of this application instance.
     */
    @GET
    public String health() {
        return StatusHolder.getCurrentStatus().name();
    }

    /**
     * Allows changing the current status of this application instance.
     * 
     * @return Current status after the change.
     */
    @PUT
    @Path("/toggleStatus")
    public String toggleStatus() {
        return StatusHolder.toggleStatus().name();
      }
}
