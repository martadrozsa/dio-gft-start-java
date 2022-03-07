package com.denisczwicz.explorandopadroesdeprojetosjavaspring.repositories;

import com.denisczwicz.explorandopadroesdeprojetosjavaspring.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
