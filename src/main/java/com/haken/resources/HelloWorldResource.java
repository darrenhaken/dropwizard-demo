package com.haken.resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import com.haken.Saying;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    private final String defaultName = "HelloWorld";
    private String applicationName;

    public HelloWorldResource(String applicationName) {
        this.applicationName = applicationName;
    }

    @GET
    @Timed
    public Saying sayHello() {
        return new Saying(this.applicationName);
    }
}

