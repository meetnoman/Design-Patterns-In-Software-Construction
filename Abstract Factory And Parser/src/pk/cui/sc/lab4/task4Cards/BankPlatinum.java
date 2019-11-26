package pk.cui.sc.lab4.task4Cards;

public class BankPlatinum extends Bank{
	public  ICreditCard createCard() {
		return new PlatinumCreditCard();
		 
	 }
}
