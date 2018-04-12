package com.alenasoft.urbanager.resources.primo;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("primo")
public class PrimoResource {

    @Inject
    private PrimoService service;

    @GET
    public String ping() {
        return "OK";
    }

    @GET
    @Path("{entero}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getResult(@PathParam("entero") int entero) {
        String result="";
        try {
            result = this.service.isPrimoToString(entero);
        } catch (Exception e){
            result = "FAIL";
        }
        return result;
    }
/*
    @GET
    @Path("query")
    public String helloWorldQuery(@QueryParam("data") String data,
                                  @QueryParam("second") String second) {
        return data + second;
    }

    @GET
    @UnitOfWork
    @Path("{num1}/{num2}")
    public Response sumNumbers(@PathParam("num1") int num1,
                               @PathParam("num2") int num2) {
        long idCreated = this.service.sum(num1, num2);
        return Response
                .created(URI.create("/api/hello/" + idCreated))
                //.entity(this.service.sum(num1, num2))
                .build();
    }
*/
}
