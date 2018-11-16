package com.ccaprojects.sgdapp.clientservice.bootstrap;

import com.ccaprojects.sgdapp.clientservice.model.Client;
import com.ccaprojects.sgdapp.clientservice.repositories.ClientRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ClientRepository clientRepository;

    public DevBootstrap(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    public void initData() {
        Client client1 = new Client(1L, "christian 1");
        clientRepository.save(client1);

        Client client2 = new Client(2L, "christian 2");
        clientRepository.save(client2);
    }
}
