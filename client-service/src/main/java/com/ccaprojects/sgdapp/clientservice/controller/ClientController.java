package com.ccaprojects.sgdapp.clientservice.controller;

import com.ccaprojects.sgdapp.clientservice.model.Client;
import com.ccaprojects.sgdapp.clientservice.repositories.ClientRepository;
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

    private ClientRepository clientRepository;

    @Autowired
    public void setClientRepository(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/client/id/{id}")
    public Client getClient(@PathVariable Long id) {

        Client client = clientRepository.findById(1L).get();

        logger.info("heello");

        return client;
    }
}
