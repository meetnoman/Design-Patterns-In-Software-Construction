package pk.cui.sc.lab4.task4Cards;

public class BankMoneyBack extends Bank{

	BankMoneyBack(){}
	
	public  ICreditCard createCard() {
		return new MoneyBackCreditCard();
		 
	 }
		
}
