package com.training;
import java.util.*;

import com.training.Service.CreditCardService;
import com.training.model.CreditCard;

public class CreditApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<CreditCard> cards= new ArrayList<CreditCard>();
       
       cards.add(new CreditCard(25, "John", 2544142,800000 ));
       cards.add(new CreditCard(28, "Raj", 2364142,45500 ));
       cards.add(new CreditCard(40, "James", 2523642,600000 ));
       
       
       CreditCardService service= new  CreditCardService(cards);
       service.usingFilterandMap();
       service.collectingToMap();
       service.maxCreditLimit();
       service.minCreditLimit();
       
	}

}
