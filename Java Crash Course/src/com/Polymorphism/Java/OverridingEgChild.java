package com.Polymorphism.Java;

public class OverridingEgChild extends OverridingEgParent{
	
	@Override
	public void BikeName() {
		
		System.out.println("I have changed my mind decided to buy Honda Hornet");
	}

	public static void main(String[] args) {
	
		OverridingEgParent parent = new OverridingEgChild();
		parent.BikeModel();
		parent.BikeName();

	}

}
