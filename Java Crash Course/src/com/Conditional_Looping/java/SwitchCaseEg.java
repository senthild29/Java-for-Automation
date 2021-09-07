package com.Conditional_Looping.java;

public class SwitchCaseEg {

	String MyPet = "Dog";

	public void guessPet() {

		switch (MyPet) {
		case "Cat":
			System.out.println("Your pet is Cat");
			break;
		case "Parrot":
			System.out.println("Your pet is Parrot");
			break;
		case "Hamster":
			System.out.println("Your pet is Hamster");
			break;
		case "Hen":
			System.out.println("Your pet is Hen");
			break;
		default:
			System.out.println("Sorry ! I am not able to guess your pet");
		}
	}
	public static void main(String[] args) {
		SwitchCaseEg switchcase = new SwitchCaseEg();
		switchcase.guessPet();

	}

}
