package com.training.model;

public class Application  {
	public static void main (String[] args) {
	printQuote quote=new printQuote();
	quote.printer(new marutiCar());
	quote.printer(new toyotaCar());
	}

}
