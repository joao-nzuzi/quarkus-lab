package com.quarkus.lab;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class QuarkusLabResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello from Quarkus REST"));
    }

    @Test
    public void testarEndpointSaudacao(){
        String uuid = UUID.randomUUID().toString();
        given()
                .pathParam("nome", uuid)
                .when().get("/hello/saudacao/{nome}")
                .then()
                    .statusCode(200)
                    .body(is("Olá, " +uuid));
    }

}