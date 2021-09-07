package com.MyConstructor.Java;

public class ConstructOverloading {

	String draw;

	ConstructOverloading() {
		System.out.println("Draw an Image");
	}

	ConstructOverloading(String getDraw) {
		draw=getDraw;
		System.out.println("Drawing => "+draw);

	}

	public static void main(String[] args) {
		ConstructOverloading overload = new ConstructOverloading();
		ConstructOverloading overload1 = new ConstructOverloading("Pentagon");

	}

}
