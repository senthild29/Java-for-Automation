package com.MyPackage.Java;

 public class InheritHonda extends InheritBike{

	 public static void main(String[] args) {
		
		InheritBike bike = new InheritBike();
		bike.IgnitionStart();
		
		System.out.println("Ignition started using InheritHonda(child) class");
		System.out.println("Fuel Type of this Bike => "+bike.FuelType);

	}

}
