package day15_Scanner;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
/* In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

-Declare integer variables num1, num2, num3, sum.

-Create a Scanner object named scan.

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"*/
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter 3 numbers:");
		
		int num1 = input.nextInt();
		
		
		int num2 = input.nextInt();
		
		
		int num3 = input.nextInt();
		
		
		
		System.out.println("Sum of numbers:"+(num1+num2+num3));
		
		
		
		
	}
	
	
}
