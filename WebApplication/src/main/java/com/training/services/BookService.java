package com.training.services;

import java.util.*;

import com.training.entity.Book;

public class BookService {
	Map<String,List<Book>> bookList;

	public BookService() {
		super();
		// TODO Auto-generated constructor stub
		bookList = new HashMap<>();
		init();
	}
	 public void init() {
		 List<Book>  java = new ArrayList<>();
		 java.add(new Book(851,"Java Programming"));
		 java.add(new Book(996,"Core Java"));
		 
		 List<Book>  python = new ArrayList<>();
		 python.add(new Book(142,"Basic Python"));
		 python.add(new Book(746,"OOPS with Python"));
		 
		 
		 
		 bookList.put("java", java);
		 bookList.put("python", python);
	 }
		 
		 
		 public List<Book> searchBook(String key) {
			 
			 return this.bookList.get(key);
			 
		 }
		 
	 
	 
	
	

}
