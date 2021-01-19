package com.danu.finalkeyword;

/**
 * static blank final variable ( initialize in only satic block)
 * @author danua
 * @since 2021-01-02
 */
public class Hospital {

	static final int data;
	static{
		data=50;
		System.out.println("Static block: " + data);
	}
	
	public static void main(String[] args) {
		System.out.println(Hospital.data);
	}
}

// output: Static block: 50
//         50