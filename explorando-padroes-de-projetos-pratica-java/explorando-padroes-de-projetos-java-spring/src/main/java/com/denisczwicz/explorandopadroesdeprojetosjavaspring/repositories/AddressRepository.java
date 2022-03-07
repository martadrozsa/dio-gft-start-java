package com.denisczwicz.explorandopadroesdeprojetosjavaspring.repositories;

import com.denisczwicz.explorandopadroesdeprojetosjavaspring.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, String> {
}
