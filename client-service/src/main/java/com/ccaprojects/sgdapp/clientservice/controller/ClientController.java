package com.ccaprojects.sgdapp.clientservice.controller;

import com.ccaprojects.sgdapp.clientservice.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private Environment environment;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/client/id/{id}")
    public Client getClient(@PathVariable Long id) {

        Client client = new Client(1L, "Direccion de prueba");

        //logger.info("{}", environment.getProperty("local.server.port"));

        return client;
    }
}
