package com.quarkus.lab.config;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
//import org.testcontainers.containers.ContainerLaunchException;
//import org.testcontainers.containers.PostgreSQLContainer;

import org.jboss.logging.Logger;

@ApplicationScoped
public class BancoEmMemoriaConfig {

//    private static final Logger LOGGER = Logger.getLogger(BancoEmMemoriaConfig.class);
//
//    // Define o container PostgreSQL como atributo da classe
//    private static final PostgreSQLContainer<?> POSTGRES_CONTAINER;
//
//    static {
//        try {
//            POSTGRES_CONTAINER = new PostgreSQLContainer<>("postgres:15")
//                    .withDatabaseName("testdb")
//                    .withUsername("postgres")
//                    .withPassword("postgres");
//        } catch (Exception e) {
//            LOGGER.error("Falha ao criar container PostgreSQL", e);
//            throw new RuntimeException("Falha na inicialização do container de banco de dados", e);
//        }
//    }
//
//    /**
//     O Quarkus carrega as configurações na seguinte ordem de precedência:
//     1. Variáveis do sistema (System.setProperty(...))
//     2. Variáveis de ambiente do sistema operacional
//     3. application.properties ou application.yml
//
//     Nota: Com a config abaixo, as propriedades no ficheiro properties podem ser removidas, pois elas serão sobreecritas.
//     Caso se prefira manter as propriedades do ficheiro properties, basta que o metodo abaixo seja comentado
//     **/
//    private void configureQuarkusProperties() {
//        try {
//            String reactiveUrl = POSTGRES_CONTAINER.getJdbcUrl().replace("jdbc:", "");
//            System.setProperty("quarkus.datasource.reactive.url", reactiveUrl);
//            System.setProperty("quarkus.datasource.username", POSTGRES_CONTAINER.getUsername());
//            System.setProperty("quarkus.datasource.password", POSTGRES_CONTAINER.getPassword());
//            LOGGER.info("Propriedades do Quarkus configuradas com sucesso");
//        } catch (Exception e) {
//            LOGGER.error("Falha ao configurar propriedades do Quarkus", e);
//            throw new RuntimeException("Erro na configuração das propriedades do banco de dados", e);
//        }
//    }
//
//
//    private void startContainer() {
//        try {
//            if (!POSTGRES_CONTAINER.isRunning()) {
//                POSTGRES_CONTAINER.start();
//                LOGGER.info("Container PostgreSQL iniciado com sucesso");
//            }
//        } catch (ContainerLaunchException e) {
//            LOGGER.error("Falha ao iniciar container PostgreSQL", e);
//            throw new RuntimeException("Não foi possível iniciar o container do banco de dados", e);
//        }
//    }
//
//    // Método chamado automaticamente ao iniciar a aplicação
//    @PostConstruct
//    void initializeDatabase() {
//        try {
//            startContainer();
//            configureQuarkusProperties();
//        } catch (Exception e) {
//            LOGGER.error("Falha ao inicializar banco de dados", e);
//            throw new RuntimeException("Falha na configuração do banco de dados", e);
//        }
//    }
}
