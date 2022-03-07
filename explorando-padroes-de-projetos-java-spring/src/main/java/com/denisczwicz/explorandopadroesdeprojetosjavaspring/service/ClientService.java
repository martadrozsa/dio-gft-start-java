package com.denisczwicz.explorandopadroesdeprojetosjavaspring.service;

import com.denisczwicz.explorandopadroesdeprojetosjavaspring.model.Client;

public interface ClientService {

    Iterable<Client> findAll();

    Client findById(Long id);

    void insert(Client client);

    void update(Long id, Client client);

    void delete(Long id);

}



