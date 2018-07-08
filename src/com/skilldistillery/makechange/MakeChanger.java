package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChanger {

	public static void main(String[] args) {
		
		priceOfItem(); 
		
		//calculateChange(); can't use this method right now 
		
	}
	
	public static void priceOfItem() {
		Scanner sc = new Scanner(System.in);
		
		double amountPaid = 0.0; 
		double price = 0.0; 
		
		System.out.print("Amount: ");
		price = sc.nextDouble(); 
		
		System.out.print("Tendered: ");  
		amountPaid = sc.nextDouble();
		
		if(amountPaid < price || amountPaid == price) {
			System.err.print("Please enter an amount greater than the price so I can calculate your change: ");
			
		sc.close();
		}
		
// start of calculating change
		

		double change = amountPaid - price; 
		System.out.println("change: " + change);
		
		double hundreds = 0, fifties = 0, twenties = 0, tens = 0, fives = 0, ones = 0, quarters = 0, dimes = 0, nickels = 0, 
				pennies = 0; 
		
		double hundredChange = change / 100.00; 
		double fiftyChange = change / 50.00; 
		double twentyChange = change / 20.00; 
		double tenChange = change / 10.00; 
		double fiveChange = change / 5.00; 
		double oneChange = change / 1.00; 
		double quarterChange = change / 0.25; 
		double dimeChange = change / 0.10; 
		double nickelChange = change / 0.05; 
		double pennyChange = change / .01; 
		
		
		
			
				if(change % 100 == 0 || change / 100 > 1) {
					hundreds = hundredChange; 
				}
				else if(change % 50 == 0 || change / 50 > 1) {
					fifties = fiftyChange; 
				}
				else if(change % 20 == 0 || change / 20 > 1) {
					twenties = twentyChange; 
				}
				else if(change % 10 == 0 || change / 10 > 1) {
					tens = tenChange; 
				}
				else if(change % 5 == 0 || change / 5 > 1) {
					fives = fiveChange; 
				}
				else if(change % 1 == 0 || change / 1 > 1) {
					ones = oneChange;
				}
				else if(change % .25 == 0 || change / .25 > 1) {
					quarters = quarterChange;
				}
				else if(change % .10 == 0 || change / .1  > 1) {
					dimes = dimeChange; 
				}
				else if(change % .05 == 0 || change / .05 > 1) {
					nickels = nickelChange; 
				}
				else {
					pennies = pennyChange; 
				}
				
				double change2 = (change - ((hundreds * 100.0000000000) + (fifties * 50.0000000000) + (twenties * 20.0000000000) + 
						(tens * 10.0000000000) + (ones * 1.0000000000) + (quarters * 0.2500000000) + (dimes * 0.1000000000) + 
						(nickels * 0.0500000000) + (pennies * 0.0100000000))); 
				System.out.println("new change = " + change2);
				
// loop 2 (Change2) 
			
			if(change2 > 0) { 
				if(change2 % 100 == 0 || change2 / 100 > 1) {
					hundreds = hundredChange; 
				}
				else if(change2 % 50 == 0 || change2 / 50 > 1) {
					fifties = fiftyChange; 
				}
				else if(change2 % 20 == 0 || change2 / 20 > 1) {
					twenties = twentyChange; 
				}
				else if(change2 % 10 == 0 || change2 / 10 > 1) {
					tens = tenChange; 
				}
				else if(change2 % 5 == 0 || change2 / 5 > 1) {
					fives = fiveChange; 
				}
				else if(change2 % 1 == 0 || change2 / 1 > 1) {
					ones = oneChange;
				}
				else if(change2 % .25 == 0 || change2 / .25 > 1) {
					quarters = quarterChange;
				}
				else if(change2 % .10 == 0 || change2 / .1  > 1) {
					dimes = dimeChange; 
				}
				else if(change2 % .05 == 0 || change2 / .05 > 1) {
					nickels = nickelChange; 
				}
				else {
					pennies = pennyChange; 
				}
			} 	
				double change3 = (change - ((hundreds * 100.0000000000) + (fifties * 50.0000000000) + (twenties * 20.0000000000) + 
						(tens * 10.0000000000) + (ones * 1.0000000000) + (quarters * 0.2500000000) + (dimes * 0.1000000000) + 
						(nickels * 0.0500000000) + (pennies * 0.0100000000))); 
				System.out.println("new change = " + change3); 
			 
				
// loop for change 3
			if(change3 > 0) {
				if(change3 % 100 == 0 || change3 / 100 > 1) {
					hundreds = hundredChange; 
				}
				else if(change3 % 50 == 0 || change3 / 50 > 1) {
					fifties = fiftyChange; 
				}
				else if(change3 % 20 == 0 || change3 / 20 > 1) {
					twenties = twentyChange; 
				}
				else if(change3 % 10 == 0 || change3 / 10 > 1) {
					tens = tenChange; 
				}
				else if(change3 % 5 == 0 || change3 / 5 > 1) {
					fives = fiveChange; 
				}
				else if(change3 % 1 == 0 || change3 / 1 > 1) {
					ones = oneChange;
				}
				else if(change3 % .25 == 0 || change3 / .25 > 1) {
					quarters = quarterChange;
				}
				else if(change3 % .10 == 0 || change3 / .1  > 1) {
					dimes = dimeChange; 
				}
				else if(change3 % .05 == 0 || change3 / .05 > 1) {
					nickels = nickelChange; 
				}
				else {
					pennies = pennyChange; 
				}
			} 
				
				double change4 = (change - ((hundreds * 100.0000000000) + (fifties * 50.0000000000) + (twenties * 20.0000000000) + 
						(tens * 10.0000000000) + (ones * 1.0000000000) + (quarters * 0.2500000000) + (dimes * 0.1000000000) + 
						(nickels * 0.0500000000) + (pennies * 0.0100000000))); 
				System.out.println("new change = " + change4);
				
// loop for change 4
				if(change4 > 0) {
					if(change4 % 100 == 0 || change4 / 100 > 1) {
						hundreds = hundredChange; 
					}
					else if(change4 % 50 == 0 || change4 / 50 > 1) {
						fifties = fiftyChange; 
					}
					else if(change4 % 20 == 0 || change4 / 20 > 1) {
						twenties = twentyChange; 
					}
					else if(change4 % 10 == 0 || change4 / 10 > 1) {
						tens = tenChange; 
					}
					else if(change4 % 5 == 0 || change4 / 5 > 1) {
						fives = fiveChange; 
					}
					else if(change4 % 1 == 0 || change4 / 1 > 1) {
						ones = oneChange;
					}
					else if(change4 % .25 == 0 || change4 / .25 > 1) {
						quarters = quarterChange;
					}
					else if(change4 % .10 == 0 || change4 / .1  > 1) {
						dimes = dimeChange; 
					}
					else if(change4 % .05 == 0 || change4 / .05 > 1) {
						nickels = nickelChange; 
					}
					else {
						pennies = pennyChange; 
					}
				} 
				
				double change5 = (change - ((hundreds * 100.0000000000) + (fifties * 50.0000000000) + (twenties * 20.0000000000) + 
						(tens * 10.0000000000) + (ones * 1.0000000000) + (quarters * 0.2500000000) + (dimes * 0.1000000000) + 
						(nickels * 0.0500000000) + (pennies * 0.0100000000))); 
				System.out.println("new change = " + change5);
				
// loop for change 5
				if(change5 > 0) {
					if(change5 % 100 == 0 || change5 / 100 > 1) {
						hundreds = hundredChange; 
					}
					else if(change5 % 50 == 0 || change5 / 50 > 1) {
						fifties = fiftyChange; 
					}
					else if(change5 % 20 == 0 || change5 / 20 > 1) {
						twenties = twentyChange; 
					}
					else if(change5 % 10 == 0 || change5 / 10 > 1) {
						tens = tenChange; 
					}
					else if(change5 % 5 == 0 || change5 / 5 > 1) {
						fives = fiveChange; 
					}
					else if(change5 % 1 == 0 || change5 / 1 > 1) {
						ones = oneChange;
					}
					else if(change5 % .25 == 0 || change5 / .25 > 1) {
						quarters = quarterChange;
					}
					else if(change5 % .10 == 0 || change5 / .1  > 1) {
						dimes = dimeChange; 
					}
					else if(change5 % .05 == 0 || change5 / .05 > 1) {
						nickels = nickelChange; 
					}
					else {
						pennies = pennyChange; 
					}
				} 
				
				double change6 = (change - ((hundreds * 100.0000000000) + (fifties * 50.0000000000) + (twenties * 20.0000000000) + 
						(tens * 10.0000000000) + (ones * 1.0000000000) + (quarters * 0.2500000000) + (dimes * 0.1000000000) + 
						(nickels * 0.0500000000) + (pennies * 0.0100000000))); 
				System.out.println("new change = " + change6);
				
					
					System.out.println("Result: "); 
				
						if (hundreds > 0) {
							System.out.print(hundreds + " hundred dollar bill, ");
						}
						if (fifties > 0) {
							System.out.print(fifties + " fifty dollar bill, ");
						}
						if (twenties > 0) {
							System.out.print(twenties + " twenty dollar bill, ");
						}
						if (tens > 0) {
							System.out.print(tens + " ten dollar bill, ");
						}
						if (fives > 0) {
							System.out.print(fives + " five dollar bill, ");
						}
						if (ones > 0) {
							System.out.print(ones + " one dollar bill, ");
						}
						if (quarters > 0) {
							System.out.print(quarters + " quarter, ");
						}
						if (dimes > 0) {
							System.out.print(dimes + " dime, ");
						}
						if (nickels > 0) {
							System.out.print(nickels + " nickel, ");
						}
						if (pennies > 1) {
							System.out.print(pennies + " pennies.");
						}
						if (pennies == 1) {
							System.out.println(pennies + " penny.");
						}
				
						
	} 
} 

//Amount: .67, Tendered: .50, Result: Error message
//Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.
