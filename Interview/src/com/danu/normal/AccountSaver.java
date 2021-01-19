package com.danu.normal;

import java.util.Scanner;

public class AccountSaver {
	
	public static void main(String[] args) {
		
		double total_balance =0;
		double acc_balance = 0;
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		for(int i = 1; i<=x ; i++){
			
			
			acc_balance = total_balance + 6000;
			double interest_amount = (acc_balance * 0.05)/12; 
			total_balance = acc_balance + interest_amount;
			
		}
		System.out.println(total_balance);
	}

}
