package com.ccaprojects.sgdapp.contractservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ContractController {

    private Environment environment;

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/contract/id/{id}")
    public ClientBean datosCliente(@PathVariable Integer id) {
        System.out.println("Puerto : " + environment.getProperty("local.server.port"));

        Map<String, Integer> uriVariables = new HashMap<>();
        uriVariables.put("id", 1);

        ResponseEntity<ClientBean> responseEntity = new RestTemplate().getForEntity("http://localhost:8001/client/id/{id}", ClientBean.class, uriVariables);
        ClientBean response = responseEntity.getBody();

        return new ClientBean(response.getIdClient(), response.getAddress(), "Nombre cliente");
    }
}
