package com.example.demo;

import com.example.demo.service.InvoiceService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		InvoiceService service = new InvoiceService();
		System.out.println("Hii" + service.getInvoice());
	}
}
