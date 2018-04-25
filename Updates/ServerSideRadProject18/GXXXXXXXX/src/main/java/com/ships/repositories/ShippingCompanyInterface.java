package com.ships.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ships.model.Ship;
import com.ships.model.ShippingCompany;

public interface ShippingCompanyInterface extends CrudRepository<ShippingCompany, Long>{

	

}
