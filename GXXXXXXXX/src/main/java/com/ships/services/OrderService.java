package com.ships.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ships.model.OrderInfo;
import com.ships.repositories.OrderInfoInterface;

@Service
public class OrderService {

	public Iterable<OrderInfo> findAll() {
		
		OrderInfoInterface orderInfoInterface;
		
		ArrayList<OrderInfo> findAll() {
			return orderInfoInterface.findAll();
		}
		
	}

}
