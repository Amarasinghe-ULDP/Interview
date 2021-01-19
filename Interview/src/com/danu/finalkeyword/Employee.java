package com.danu.finalkeyword;

/**
 * Blank final variable
 * @author danua
 * @since 2021-01-02
 */
public class Employee {
	
	int id;
	String name;
	// Cannot Declare final variables. We should initialize the variable (assign a value when it creating)
	final String BANK_CARD_NUMBER;
	
	// or you have to set value for it in constructor.
	public Employee() {
		BANK_CARD_NUMBER = "234523452345";
		System.out.println(BANK_CARD_NUMBER);
	}
	
	public static void main(String[] args) {
		//when we creating new object, Constructor will call automatically
		Employee employee = new Employee();
	}

}
