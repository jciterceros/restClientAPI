package com.jciterceros.restClientAPI.services;

import com.jciterceros.restClientAPI.dto.ClientDTO;
import com.jciterceros.restClientAPI.entities.Client;
import com.jciterceros.restClientAPI.repositories.ClientRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    private final ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> page = repository.findAll(pageable);
        return page.map(ClientDTO::new);
    }
}
