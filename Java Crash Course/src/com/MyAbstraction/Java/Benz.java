package com.MyAbstraction.Java;

public class Benz extends ParentCarCompany {
	
	@Override
	public  void Model() {
		System.out.println("Benz Model is => Limousine");
	}

	@Override
	public  void Engine() {
		System.out.println("Benz engine type => Turbo charged 3 Cyclinder");
	}


	public static void main(String[] args) {
	
		ParentCarCompany car = new Benz();
		car.Model();
		car.Engine();
		car.Transmission();

	}

}
