package com.ships.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ships.model.OrderInfo;
import com.ships.repositories.OrderInfoInterface;

@Service
public class OrderService {
	
	OrderInfoInterface orderInfoInterface;

	public ArrayList<OrderInfo> findAll() {
		
		return (ArrayList<OrderInfo>) orderInfoInterface.findAll();
		
		
	}

}
