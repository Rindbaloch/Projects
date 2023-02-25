package com.teresol;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/mobile")
public class MobileResource {

    List<String> lst = new ArrayList<String>();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<String> getMobiles() {
        return lst;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String addMobile(String name) {
        lst.add(name);
        return name;
    }


    @DELETE
    @Path("/{del}")
    @Produces(MediaType.TEXT_PLAIN)
    public String DelMobile(@PathParam("del") int id){
        String mob=lst.get(id);
        lst.remove(mob);
        return mob;
    }


    @PUT
    @Path("/{oldMob}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public List<String> UpdateMobile(@PathParam("oldMob") String oldmob, @QueryParam("newmob") String newmob){

        int old =lst.indexOf(oldmob);
        lst.remove(old);
        lst.add(old, newmob);

        return lst;
    }

}
