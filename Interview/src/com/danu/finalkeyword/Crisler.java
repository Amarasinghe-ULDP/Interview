package com.danu.finalkeyword;

/**
 * example for final methods (Can't override)
 * @author danua
 * @since 2021-01-02
 */
public class Crisler extends Car{

	/*
	void drive() {
		System.out.println("Drive me safely");
	}
	* cannot override final method 
	*/
	public static void main(String[] args) {
		
		Crisler crisler = new Crisler();
		crisler.drive();
	}
}
