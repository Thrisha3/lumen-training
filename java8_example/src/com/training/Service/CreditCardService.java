package com.training.Service;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.*;
import java.util.stream.*;


import com.training.model.CreditCard;

import static java.util.stream.Collectors.*;


public class CreditCardService {
	private List<CreditCard> cards;

	public CreditCardService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditCardService(List<CreditCard> cards) {
		super();
		this.cards = cards;
	}

	public List<CreditCard> getCards() {
		return cards;
	}

	public void setCards(List<CreditCard> cards) {
		this.cards = cards;
	}
	
	public void usingFilterandMap() {
		
		List<CreditCard> creditLimit5La = this.cards.stream()
				.filter((card) -> card.getCardLimit()>500000).collect(toList());
              
		creditLimit5La.forEach(System.out::println);
  		
		

	    List<String> namesCreditLimit5La = this.cards.stream()
	    		.filter((card) -> card.getCardLimit()>500000).map(card -> card.getCardHolderName()).collect(toList());
	    System.out.println("Names are:");
	
	   namesCreditLimit5La.forEach(System.out::println);

	}
	public void collectingToMap() {
		Map<String,Long> teleCallingList = this.cards.stream()
				.filter((card) -> card.getCardLimit()>500000)
				.collect(toMap( CreditCard::getCardHolderName,CreditCard:: getPhonenumber));
		
		for(Entry<String, Long> entry:teleCallingList.entrySet())
		{
		String key = entry.getKey();
		Long value = entry.getValue();
		System.out.println(key+ "= "+value);
		}
	}
	
	public void maxCreditLimit() {
		Optional<CreditCard> maxLimit =this.cards.stream()
				.max(Comparator.comparing(CreditCard::getCardLimit));
		if(maxLimit.isPresent()) {
			System.out.println("Max card Limit is:" +maxLimit.get().getCardLimit());
		}
		
	}
	
	
	public void minCreditLimit() {
	    Optional<CreditCard> minLimit =this.cards.stream()
			.min(Comparator.comparing(CreditCard::getCardLimit));
	
	if(minLimit.isPresent()) {
		System.out.println("Min card Limit is:" +minLimit.get().getCardLimit());
	}
	
	
}
}
