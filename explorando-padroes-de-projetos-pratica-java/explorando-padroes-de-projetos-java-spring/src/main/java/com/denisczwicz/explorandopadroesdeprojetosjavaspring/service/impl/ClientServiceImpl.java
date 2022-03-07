package com.denisczwicz.explorandopadroesdeprojetosjavaspring.service.impl;

import com.denisczwicz.explorandopadroesdeprojetosjavaspring.model.Address;
import com.denisczwicz.explorandopadroesdeprojetosjavaspring.model.Client;
import com.denisczwicz.explorandopadroesdeprojetosjavaspring.repositories.AddressRepository;
import com.denisczwicz.explorandopadroesdeprojetosjavaspring.repositories.ClientRepository;
import com.denisczwicz.explorandopadroesdeprojetosjavaspring.service.ClientService;
import com.denisczwicz.explorandopadroesdeprojetosjavaspring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {


    private final ClientRepository clientRepository;
    private final AddressRepository addressRepository;
    private final ViaCepService viaCepService;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository, AddressRepository addressRepository, ViaCepService viaCepService) {
        this.clientRepository = clientRepository;
        this.addressRepository = addressRepository;
        this.viaCepService = viaCepService;
    }

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.get();
    }

    @Override
    public void insert(Client client) {
        salveClientWithCep(client);
    }

    @Override
    public void update(Long id, Client client) {
        Optional<Client> clientBd = clientRepository.findById(id);
        if (clientBd.isPresent()) {
            salveClientWithCep(client);
        }
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    private void salveClientWithCep(Client client) {
        // Verificar se o Endereco do Cliente já existe (pelo CEP).
        String cep = client.getAddress().getCep();
        Address address = addressRepository.findById(cep).orElseGet(() -> {
            // Caso não exista, integrar com o ViaCEP e persistir o retorno.
            Address newAddress = viaCepService.searchCep(cep);
            addressRepository.save(newAddress);
            return newAddress;
        });
        client.setAddress(address);
        // Inserir Cliente, vinculando o Endereco (novo ou existente).
        clientRepository.save(client);
    }
}
