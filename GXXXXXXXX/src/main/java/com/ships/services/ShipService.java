package com.ships.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ships.model.Ship;
import com.ships.model.ShippingCompany;
import com.ships.repositories.ShipRepository;

@Service
public class ShipService {
	
	@Autowired
	private ShipRepository shipRepo;
	
	// Method for ships dbase
	public List<Ship> findShips() {
		return(List<Ship>) shipRepo.findAll();
	}

	public static Iterable<Ship> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Ship ship) {
		// TODO Auto-generated method stub
		return ShipRepository.save(ship);
	}
	

}
