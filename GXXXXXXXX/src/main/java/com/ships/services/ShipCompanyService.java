package com.ships.services;

 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

import com.ships.model.Ship;
import com.ships.model.ShippingCompany;
import com.ships.repositories.ShippingCompanyInterface;


 @Service
 public class ShipCompanyService {

	@Autowired
	private ShippingCompanyInterface shippingCompanyRepository;
	
	public Iterable<ShippingCompany> findAll() {
		return (List<Ship>) shippingCompanyRepository.findAll();
		
	}
	
}
