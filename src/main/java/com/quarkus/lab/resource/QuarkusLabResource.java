package com.quarkus.lab.resource;

import com.quarkus.lab.entity.QuarkusLabEntity;
import com.quarkus.lab.service.PasswordService;
import com.quarkus.lab.service.QuarkusLabService;
import io.quarkus.hibernate.reactive.panache.Panache;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestResponse;

import java.net.URI;
import java.util.List;

@Path("/quarkus-lab")
public class QuarkusLabResource {

    @Inject
    QuarkusLabService service;
    @Inject
    PasswordService passwordService;

    @GET
    @Path("/saudacao/{nome}")
    public String saudacao(String nome){
        return service.saudacao(nome);
    }

    @POST @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/usuarios/create")
    public Uni<RestResponse<QuarkusLabEntity>> create(QuarkusLabEntity quarkusLab){
        quarkusLab.password = passwordService.hash(quarkusLab.password);
        return Panache.withTransaction(quarkusLab::persist).replaceWith(RestResponse.status(RestResponse.Status.CREATED, quarkusLab));
    }

    @POST @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/usuarios/cadastrar")
    public Uni<Response> cadastrar(QuarkusLabEntity quarkusLab) {
        quarkusLab.password = passwordService.hash(quarkusLab.password);
        return quarkusLab.persist()
                        .replaceWith(() -> Response
                                .created(URI.create("/usuarios/" + quarkusLab.id))
                                .entity("Usuário criado com sucesso")
                                .build());

//        return Panache.withTransaction(() ->
//                quarkusLab.persist()
//                .replaceWith(() -> Response
//                        .created(URI.create("/usuarios/" + quarkusLab.id))
//                        .entity("Usuário criado com sucesso")
//                        .build())
//        );
    }

    @GET @Path("/usuarios")
    public Uni<List<QuarkusLabEntity>> getAll(){
        return QuarkusLabEntity.listAll(Sort.by("username"));
    }

//    @GET @Path("/usuarios/buscar/{id}") @Produces(MediaType.APPLICATION_JSON)
//    public Uni<QuarkusLabEntity> getById(Long id){
//        return QuarkusLabEntity.findById(id);
//    }

    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/usuarios/buscar/{id}")
    public Uni<Response> findById(@PathParam("id") Long id) {
        return QuarkusLabEntity.findById(id)
                .map(user -> user != null
                        ? Response.ok(user).build()
                        : Response.status(Response.Status.NOT_FOUND).build());
    }
}
