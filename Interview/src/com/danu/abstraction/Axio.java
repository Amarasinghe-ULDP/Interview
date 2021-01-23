package com.danu.abstraction;

public class Axio extends Car {

	public void run() {

		System.out.println("Drive Axio");

	}
	
	public static void main(String[] args) {
		
		Car myCar = new Axio();
		myCar.run();
	}
}
