package com.mycompany.myfirstmicroserviceapp.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/example")
public class ExampleService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Hello, world! of Micro Profile from Trial App";
    }

}
