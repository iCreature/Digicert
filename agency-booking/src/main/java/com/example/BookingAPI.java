package com.example;


import java.awt.PageAttributes.MediaType;
import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import javax.websocket.server.PathParam;


@Path("/agency-booking")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookingAPI {

    private List<Booking> agencies = new ArrayList();

//    public BookingAPI() {
//        this.agencies = new ArrayList<>();
//    }

    @GET
    public Response getAgencies() {
        return Response.ok(agencies).build();
    }

    @GET
    @Path("/{id}")
    public Response getAgency(@PathParam("id") int id) {
        if (id >= agencies.size()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(agencies.get(id)).build();
    }

    @POST
    public Response addAgency(Booking agency) {
        agencies.add(agency);
        return Response.ok().build();
    }

    @PUT
    @Path("/{id}")
    public Response bookingUpadte(@PathParam("id") int id, Booking book) {
        if (id >= agencies.size()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        agencies.set(id, book);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteAgency(@PathParam("id") int id) {
        if (id >= agencies.size()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        agencies.remove(id);
        return Response.ok().build();
    }

}
