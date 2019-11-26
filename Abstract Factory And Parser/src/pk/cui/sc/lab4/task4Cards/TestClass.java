package pk.cui.sc.lab4.task4Cards;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
 
		ArrayList<ICreditCard> card=new ArrayList<ICreditCard>();
		
		Bank c1=new BankMoneyBack();
		Bank c2=new BankPlatinum();
		Bank c3=new BankTitanium();
		

		ICreditCard t1= c1.createCard();
		ICreditCard t2=c2.createCard();
		ICreditCard t3=c3.createCard();
		
		card.add(t1);
		card.add(t2);
		card.add(t3);
		
		for(ICreditCard i:card) {
			System.out.println("Annual Charges: "+i.annualCharges()+" Credit Limit: "+i.checkLimit());
		}
		
	}

}
