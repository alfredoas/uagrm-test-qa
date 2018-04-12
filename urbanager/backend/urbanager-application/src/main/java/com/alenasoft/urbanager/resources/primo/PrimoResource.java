package com.alenasoft.urbanager.resources.primo;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("primo")
public class PrimoResource {

    @Inject
    private PrimoService service;

   /* @GET
    public String ping() {
        return "OK";
    }
*/
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

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> helloWorldQuery(@QueryParam("limite") int limite){
        List<String> result=new ArrayList<>();
        try {
            result = this.service.getFirstNPrimo(limite);
        } catch (Exception e){
        }
        return result;
    }
/*
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
