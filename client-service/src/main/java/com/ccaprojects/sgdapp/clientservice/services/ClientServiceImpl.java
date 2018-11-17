package com.ccaprojects.sgdapp.clientservice.services;

import com.ccaprojects.sgdapp.clientservice.model.Client;
import com.ccaprojects.sgdapp.clientservice.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> listAll() {
        List<Client> list = new ArrayList<>();
        clientRepository.findAll().forEach(list::add);
        return list;
    }
}
