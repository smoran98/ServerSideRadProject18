package com.ships.services;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

 import com.ships.model.ShippingCompany;


 @Service
 public class ShippingCompanyService {

	@Autowired
	private ShippingCompanyRepository shippingCompanyRepository;
	
	public Iterable<ShippingCompany> findAll() {
		return shippingCompanyRepository.findAll();
		
	}
	
}
