package com.jciterceros.restClientAPI.repositories;

import com.jciterceros.restClientAPI.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
