//package com.quarkus.lab.config;
//
//import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
//import org.testcontainers.containers.PostgreSQLContainer;
//
//import java.util.Map;
//
//// Essa classe configura um banco PostgreSQL em container, usado nos testes
//public class TestDatabaseLifecycle implements QuarkusTestResourceLifecycleManager {
//
//    // Cria o container PostgreSQL com nome do banco, usuário e senha
//    PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:15")
//            .withDatabaseName("testdb")
//            .withUsername("postgres")
//            .withPassword("postgres");
//
//    @Override
//    public Map<String, String> start() {
//        // Inicia o container e retorna as propriedades que sobrescrevem o application.properties
//        postgres.start();
//        return Map.of(
//                "quarkus.datasource.reactive.url", postgres.getJdbcUrl().replace("jdbc:", ""),
//                "quarkus.datasource.username", postgres.getUsername(),
//                "quarkus.datasource.password", postgres.getPassword()
//        );
//    }
//
//    @Override
//    public void stop() {
//        // Para o container após os testes
//        postgres.stop();
//    }
//}
