package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double amountPaid = 0.0, price = 0.0;  
		
		// prompt user for amount and tendered 
		System.out.print("Amount: ");
		price = sc.nextDouble(); 
		
		System.out.print("Tendered: ");  
		amountPaid = sc.nextDouble();
		
		// error message in case an invalid amount is entered 
		if(amountPaid < price || amountPaid == price) {
			System.err.print("Please enter an amount greater than the price so I can calculate your change! ");
		}
		
		sc.close();
		
		// variables that will be used for exact change calculations
		double change = amountPaid - price; 
		double hundreds = 0, fifties = 0, twenties = 0, tens = 0, fives = 0, ones = 0, 
				quarters = 0, dimes = 0, nickels = 0, pennies = 0;  
		
		// while loop to calculate exact change
		while(change != 0) {
			if(change % 100 == 0 || change / 100 > 1) {
				hundreds = Math.floor(change / 100); 
				change = change - (hundreds * 100); 
			}
			if(change % 50 == 0 || change / 50 > 1) {
				fifties = Math.floor(change / 50);
				change = change - (fifties * 50); 
			}
			if(change % 20 == 0 || change / 20 > 1) {
				twenties = Math.floor(change / 20);
				change = change - (twenties * 20); 
			}
			if(change % 10 == 0 || change / 10 > 1) {
				tens = Math.floor(change / 10);
				change = change - (tens * 10); 
			}
			if(change % 5 == 0 || change / 5 > 1) {
				fives = Math.floor(change / 5);
				change = change - (fives * 5); 
			}
			if(change % 1 == 0 || change / 1 > 1) {
				ones = Math.floor(change / 1);
				change = change - (ones * 1); 
			}
			if(change % .25 < 0.01 || change % .25 > 0.00 || change / .25 > 0.99 || change / .25 < 1.01) {  
				quarters = change / .25; 
				quarters = Math.floor(quarters); 
				change = change - (quarters * .25); 
				change = Math.round(change * 100.0) / 100.0; 
			}
			if(change % .10 < 0.01 || change % .10 > 0.001 || change / .10 > 0.99 || change / .10 < 1.00) { // here
				dimes = change / .10;
				dimes = Math.floor(dimes); 
				change = change - (dimes * .10); 
				change = Math.round(change * 100.0) / 100.0; 
			}
			if(change % .05 < 0.01 || change % .05 > 0.009 || change / .05 > 0.99 || change / .05 < 1.01) {
				nickels = change / .05;
				nickels = Math.floor(nickels); 
				change = change - (nickels * .05); 
				change = Math.round(change * 100.0) / 100.0;
			}
			if(change % .01 < 0.01 || change % .01 > 0.009 || change / .01 > 0.99 || change / .01 < 1.01) {
				pennies = change / .01;
				pennies = Math.floor(pennies); 
				change = change - (pennies * .01); 
				change = Math.round(change * 100.0) / 100.0;
			}
			if(change < .01) {
				break; 
			}
			else {
				break; 
			}
			
		}
		
		// printing exact change calculations back out to user 
			System.out.print("Result: ");
			
			if (hundreds > 0) {
				System.out.print(hundreds + " hundred dollar bills, ");
			}
			if (fifties > 0) {
				System.out.print(fifties + " fifty dollar bills, ");
			}
			if (twenties > 0) {
				System.out.print(twenties + " twenty dollar bills, ");
			}
			if (tens > 0) {
				System.out.print(tens + " ten dollar bills, ");
			}
			if (fives > 0) {
				System.out.print(fives + " five dollar bills, ");
			}
			if (ones > 0) {
				System.out.print(ones + " one dollar bills, ");
			}
			if (quarters > .99) {
				System.out.print(quarters + " quarters, ");
			}
			if (dimes >= .99) {
				System.out.print(dimes + " dimes, ");
			}
			if (nickels >= .99) {
				System.out.print(nickels + " nickels, ");
			}
			if (pennies >= .99) {
				System.out.print(pennies + " pennies.");
			}
			
	}
} 