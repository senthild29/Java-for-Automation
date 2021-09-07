package com.MyCollection.Java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEg {

	public void CreateObject() {
		// Created object for HashSet using HashSet Class
		HashSet<Integer> HashColl = new HashSet<Integer>();
		
		HashSet HashColl2= new HashSet();
				
				
		HashColl.add(8);
		HashColl.add(16);
		HashColl.add(32);
		HashColl.add(64);
		HashColl.add(128);
		
		System.out.println("HashSet Elements => "+HashColl);
				
		//Method# 1 Using for each loop
		System.out.println("Using for each loop");
		for(Integer iterate: HashColl) {
			System.out.println(iterate);
		}
		System.out.println("****************");
		
		//Method# 2 Using Iterator interface
		System.out.println("Using Iterator");
			Iterator<Integer> HashIterat = HashColl.iterator();			
			while(HashIterat.hasNext()) {
				System.out.println(HashIterat.next());
			}
		System.out.println("****************");
	}
		
	public static void main(String[] args) {
		
		HashSetEg hash = new HashSetEg();
		hash.CreateObject();
		}
}
