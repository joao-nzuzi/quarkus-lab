package com.quarkus.lab.resource;

import com.quarkus.lab.entity.QuarkusLabPersonEntity;
import com.quarkus.lab.service.IQuarkusLabPersonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/person")
public class QuarkusLabPersonResource {

    @Inject
    IQuarkusLabPersonService personService;

    @POST
    @Path("/create") @Produces(MediaType.APPLICATION_JSON) @Consumes(MediaType.APPLICATION_JSON)
    public void create(QuarkusLabPersonEntity personEntity){
        personService.salvar(personEntity);
    }
}
