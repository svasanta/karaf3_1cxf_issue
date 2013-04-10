package com.test.fine.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vasanta
 * Date: 4/9/13
 * Time: 6:51 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/test/")
public interface TestRestService {
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        @Path("saysomething")
        public String  saySomething();
}
