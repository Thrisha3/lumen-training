package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Author;
import com.example.demo.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	private AuthorService service;

	@GetMapping(path = "/authors")
	public List<Author> getAll() {
		return this.service.getAll();
	}

	@PostMapping(path = "/authors")
	public Author add(@RequestBody Author entity) {
		return this.service.add(entity);

	}

	@PutMapping(path = "/authors")
	public Author update(@RequestBody Author entity) {
		return this.service.add(entity);

	}

	@DeleteMapping(path = "/authors")
	public Author remove(@RequestBody Author entity) {
		return this.service.remove(entity);

	}

	@GetMapping(path = "/authors/fn/{firstName}")
	public List<Author> getByFirstName(@PathVariable("firstName") String firstName) {

		return this.service.getByFirstName(firstName);
	}

	@GetMapping(path = "/authors/city/{city}")
	public List<Author> getByCity(@PathVariable("city") String city) {

		return this.service.getByCity(city);
	}

}
