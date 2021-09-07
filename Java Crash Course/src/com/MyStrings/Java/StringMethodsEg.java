package com.MyStrings.Java;

public class StringMethodsEg {

	public static void main(String[] args) {
		
		String name = "Welcome";
	

		// To find the character value of string using Index
		System.out.println("Get Character of String => "+name.charAt(3));
		
		// To find the Index value of String using character
		System.out.println("Get Index of String => "+name.indexOf("m"));
		
		//To find the total length of String
		System.out.println("Length of String => "+name.length());
		
		//To match the String with case sensitive
		System.out.println("Match String case sensitive=> "+name.equals("welcome"));
		
		//To match a String without case sensitive
		System.out.println("Match W/O  case sensitive=> "+name.equalsIgnoreCase("welcome"));
		
		//To find give character present in string
				System.out.println("Character present in String => "+name.contains("m"));
		
		//To check if String is Empty or not
		System.out.println("Stirng is Empty => "+name.isEmpty());
		
		//To crop a particular portion in a String using Beginning index
		
		System.out.println("Crop only Start Index=> "+name.substring(3));
		
		//To crop a particular portion in a String using Beginning and end index
		System.out.println("Crop using Start and end Index : "+name.substring(3,5));
		
		//To conact(add) a string to existing string
		System.out.println("Append String => "+name.concat(" Home"));
		
		//To replace a specific character or sequence of char in a string
		System.out.println("Replace String => "+name.replace("Welcome", "Welcome Back"));
		
		// To find the character Index value of String from specific index 
				System.out.println("Get Index specific position => "+name.indexOf("come",0));
				
		// To remove the front and back space in a string
			System.out.println("Get Index specific position => "+name.trim());
		
			// To convert number to string
			Integer ID = 13579;
			System.out.println("Convert number to String :"+String.valueOf(ID));
			
			//To convert a string from lower case to uppercase
			String name2 = "okay google";
			System.out.println("Change uppercase => "+name2.toUpperCase());
			
			//To convert a string from upper case to lower case
			String name3= "HELLO MOTO";
			System.out.println("Change lowercase => "+name3.toLowerCase());
			
			//To add any character/delimiter to a string 
			System.out.println("Add / between dates : " +String.join("/", "2021","07","09"));
			System.out.println("Add - between dates : " +String.join("hi", "2021","07","09"));
			
			// To split a String using delimiter
			
			String address = "No-10,Baker's Street,Hunter's Road,Doveton" ;
			String[] splitaddress = address.split(",");
			
			for (String splitwords : splitaddress) {
				System.out.println(splitwords);
				
			}
				
		
	}

}
