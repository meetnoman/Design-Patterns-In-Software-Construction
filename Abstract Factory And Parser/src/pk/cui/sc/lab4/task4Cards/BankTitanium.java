package pk.cui.sc.lab4.task4Cards;

public class BankTitanium extends Bank{
	public  ICreditCard createCard() {
		return new TitaniumCreditCard();
		 
	 }
}
