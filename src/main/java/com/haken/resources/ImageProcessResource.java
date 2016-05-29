package com.haken.resources;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/image-request")
@Produces(MediaType.APPLICATION_JSON)
public class ImageProcessResource {

    @POST
    public String processImage() {
        return "Hello World";
    }
}
