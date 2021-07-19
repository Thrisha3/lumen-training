package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hotel;
import com.example.demo.service.HotelService;

@RestController
public class HotelController {

	@Autowired
	public HotelService service;

	@GetMapping(path = "/hotels")
	public List<Hotel> getHotels() {
		return this.service.getHotelList();
	}

}
