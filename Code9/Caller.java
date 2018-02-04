package net.webservicex;

public class Caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConvertor c = new CurrencyConvertor();
		double price  = c.getCurrencyConvertorSoap().conversionRate(Currency.USD, Currency.AUD);
		System.out.println("Price is "+price);
	}

}
