package com.training.model;

import com.training.interfaces.Automobile;

public class printQuote{
	public void printer(Automobile auto) {
		System.out.println(auto.model());
		System.out.println(auto.color());
		System.out.println(auto.price());
	}
	}

	