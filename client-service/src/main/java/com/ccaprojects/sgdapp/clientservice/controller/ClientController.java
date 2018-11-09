package com.ccaprojects.sgdapp.clientservice.controller;

import com.ccaprojects.sgdapp.clientservice.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private Environment environment;

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/client/id/{id}")
    public Client getClient(@PathVariable Integer id) {
        System.out.println("Puerto client-service: " + environment.getProperty("local.server.port"));
        return new Client(1, "Direccion de prueba");
    }
}
