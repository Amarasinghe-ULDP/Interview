package com.danu.finalkeyword;

/**
 * final keyword for Variables
 * @author danua
 * @since 2021-01-02
 */
public class GiftBag {

	final int weightInKg = 90;
	void addWeight() {
		// weightInKg = 100;
	}
	
	public static void main(String[] args) {
		
		GiftBag gb = new GiftBag();
		gb.addWeight();
	}
}

// if we remove the comment in addWeight method
// output will be: Compile time error
// because we can't assign values to final variable after initialize that variable
