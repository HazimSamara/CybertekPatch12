package day15_Scanner;
import java.util.Scanner;
public class hm4 {
	
	public static void main(String[] args) {
		
	/*Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds. 

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

	 */
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter seconds:");
	
	int hours = input.nextInt();
	System.out.println(hours/3600 +" hours, "+ ( (hours % 3600 ) /60 )+ (" minutes,")+((" and ")+(hours % 3600 ) % 60 + (" seconds") ) );
	
	

	
	
	
	
	
}
}
