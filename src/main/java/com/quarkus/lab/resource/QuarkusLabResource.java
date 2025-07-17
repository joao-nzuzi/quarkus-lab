package com.quarkus.lab.resource;

import com.quarkus.lab.service.QuarkusLabService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class QuarkusLabResource {

    @Inject
    QuarkusLabService service;

    @GET @Produces(MediaType.TEXT_PLAIN)
    @Path("/saudacao/{nome}")
    public String saudacao(String nome){
        return service.saudacao(nome);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }
}
