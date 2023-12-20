package com.BikkadIT.RollBackTransaction.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.RollBackTransaction.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

	
}
