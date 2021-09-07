package com.MyPackage.Java;

public class ReturnTypeEg {

	// Declared a variable in a String wrapper class
	String  PurchaseItem = "Chocolate";

	//Created user defined method to buy chocolate 
	//Changed the return type to String from void and added Return type to return the chocolate
	public String BuyItem() {
		System.out.println("Hi Bro I have bought => "+PurchaseItem+ " and sent to you");
		return PurchaseItem;

	}
	
	public static void main(String[] args) {

		// Created new object for class ReturnTypeEg
		ReturnTypeEg returneg = new ReturnTypeEg();

		//Using that object instructed user defined method BuyItem() to buy the chocolates and return to main() 
		String getItem = returneg.BuyItem();

		System.out.println("I have received "+getItem+"  bro, Thanks!");

	}

}
