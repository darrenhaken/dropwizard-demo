package com.haken.resources;

import com.codahale.metrics.annotation.Timed;
import com.haken.models.ImageRequest;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

@Path("/image-request")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ImageProcessResource {

    @POST
    @Timed
    public Response processImage(@Valid ImageRequest imageRequest) {
        return Response
                .ok()
                .build();
    }
}
