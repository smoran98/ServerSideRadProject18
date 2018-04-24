package com.ships.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ships.model.OrderInfo;
import com.ships.services.OrderService;
import com.ships.services.ShipCompanyService;
import com.ships.services.ShipService;

public class ShipOrderController {

	@SessionAttributes({"order","orders"})
	@Controller
	public class OrderController {
//		Fields
		@Autowired
		private OrderService orderService;
		@Autowired
		private ShipService shipService;
		@Autowired
		private ShipCompanyService shippingCompanyService;
		
		
		
		
		@RequestMapping(value = "/showOrders", method=RequestMethod.GET)
		public String showOrders(Model model) {
			Iterable<OrderInfo> orders = orderService.findAll();
			model.addAttribute("orders", orders);
			
			return "showOrders";
			
		}

	}
	
}
