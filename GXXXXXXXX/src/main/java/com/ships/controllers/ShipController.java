package com.ships.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ships.model.Ship;
import com.ships.services.ShipService;

@SessionAttributes({"ship","ships"})
@Controller
public class ShipController {
	
	@Autowired
	private ShipService shipService;
	
	@RequestMapping(value = "/showShips", method=RequestMethod.GET)
	//(Model m (m for model)
	public String getShips(Model m){
		
		ArrayList<Ship> ships = (ArrayList<Ship>) shipService.findShips();
		
		m.addAttribute("SHIPS", ships);
		
		return "ShowShips";
	}
	
	@RequestMapping(value = "/addShip", method=RequestMethod.GET)
	public String addShip(@Valid Model m, BindingResult result) {
		Ship ship = new Ship();
		m.addAttribute("SHIPS", ship);
		
		if (result.hasErrors()) {
			return "addShip";
		}
		
		shipService.save(ship);
		
		Iterable<Ship> ships = shipService.findAll();
		m.addAttribute("SHIPS", ships);
		
		return "showShips";
	}

}
