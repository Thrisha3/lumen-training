package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

	List<Author> findByFirstNameEquals(String qString);

	List<Author> findByCityEquals(String qString);

}
