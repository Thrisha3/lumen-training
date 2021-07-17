package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Author;
import com.example.demo.repos.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository repo;

	public List<Author> getAll() {
		return this.repo.findAll();
	}

	public Author add(Author entity) {

		return this.repo.save(entity);
	}

	public Author update(Author entity) {
		return this.repo.save(entity);
	}

	public Author remove(Author entity) {

		Optional<Author> found = this.repo.findById(entity.getPhoneNumber());
		if (found.isPresent()) {
			this.repo.delete(entity);

		}
		return entity;
	}

	public List<Author> getByFirstName(String firstName) {
		return this.repo.findByFirstNameEquals(firstName);
	}

	public List<Author> getByCity(String city) {
		return this.repo.findByCityEquals(city);
	}

}
