package com.ccaprojects.sgdapp.clientservice.repositories;

import com.ccaprojects.sgdapp.clientservice.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
