package com.teresol;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class GreetingResource {


    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        return "Hello Good Morning welCome to the Quarkus";
    }

    @GET
    @Path("/bye")
    @Produces(MediaType.TEXT_PLAIN)
    public String bye() {

        return "Thanks Good Bye...";
    }


    @GET
    @Path("/help")
    @Produces(MediaType.TEXT_PLAIN)
    public String help() {

        return "Help me plzzzzzz.";
    }


}