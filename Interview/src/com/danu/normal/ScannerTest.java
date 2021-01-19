package com.danu.normal;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//take whatever the input user enter - 100\n(user input 100 and hit the enter button)
        int i = scan.nextInt();
        // i has 100 but \n is still in the buffer
        double d = scan.nextDouble();
        // d has 42 but \n is still in the buffer
        scan.nextLine();
        //now buffer hasn't \n. without above line of code we cannot get expected result.
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        /*
         * input
         * 
         * 100
         * 42
         * 42 is the answer to life, the universe, and everything!
         * 
         * expected output
         * 
         * String: 42 is the answer to life, the universe, and everything!
         * Double: 42.0
         * Int: 100
         */
	}

}
