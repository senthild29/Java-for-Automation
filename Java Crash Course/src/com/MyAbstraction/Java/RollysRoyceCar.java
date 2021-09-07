package com.MyAbstraction.Java;

public class RollysRoyceCar extends ParentCarCompany{

	@Override
	public  void Model() {
		System.out.println("Rollys Royce Model is => Boat Tail");
	}

	@Override
	public  void Engine() {
		System.out.println("Rollys Royce engine type => Turbo charged 4 Cyclinder");
	}

	public static void main(String[] args) {
		ParentCarCompany car = new RollysRoyceCar();
		
		car.Model();
		car.Engine();
		car.Transmission();
	}

}
