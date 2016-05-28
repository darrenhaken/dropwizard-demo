package com.haken.resources;

import com.codahale.metrics.annotation.Timed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rules")
@Produces(MediaType.APPLICATION_JSON)
public class RulesResource {

    @GET
    @Timed
    public String presentRandomRule() {
        return "hello";
    }
}
