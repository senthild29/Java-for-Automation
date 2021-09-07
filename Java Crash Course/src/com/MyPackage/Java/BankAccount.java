package com.MyPackage.Java;

public class BankAccount {

	//Created variables(data) and assigned to a data types
	// Both Long and String stars with Upper case, hence it's Wrapper Class
	Long AccNumber = 987654323487L;
	String AccName = "John Snow";

	//int starts with lower case, hence it's a primitive data type
	int AccBalance = 2000;

	//User defined method(function) AccHolder()
	public void AccHolder() {

		System.out.println("Bank Account Holder => "+AccName);
	}

	//User Defined method(function) BalanceInAccount()
	public void BalanceInAccount() {
		System.out.println("Available Balance => "+AccBalance);
	}

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Created object for class BankAccount
		BankAccount account = new BankAccount();

		//Usng that object called user defined methods to perform the action.
		account.AccHolder();
		account.BalanceInAccount();

	}

}
