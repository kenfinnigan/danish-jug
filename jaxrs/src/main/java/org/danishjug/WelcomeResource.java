package org.danishjug;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Ken Finnigan
 */
@Path("welcome")
public class WelcomeResource {

    @GET
    @Path("/")
    public String welcome() {
        return "Welcome to the Danish JUG!";
    }
}
