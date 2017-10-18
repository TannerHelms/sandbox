package sandbox;

import java.util.Scanner;

public class runner {

	
	public static void main(String[] args) {
		int numberBits = 10;
		int bite = 8;
		int nibble = 4;
		int byteAnswer=0, byteReminder=0; 
		byteAnswer = numberBits / bite;
		byteReminder = numberBits % 8;
		
		
	System.out.println("bits = " + numberBits + " bytes = " + byteAnswer + " remainder = " + byteReminder);
	
	/*******How to handle mixed care y, Y, yes, Yes, YES...*****/
	
	Scanner kbd = new Scanner(System.in);
	System.out.println("Hello, enter your answer (Y/N)");
 	String answer = kbd.nextLine().toUpperCase();
    System.out.println("You have entered " + answer);
    
    if (answer.equalsIgnoreCase("Y") || answer.equals("YES")){
    	System.out.println("You have selected YES!");
    }else if (answer.equalsIgnoreCase("N") || answer.equals("NO")){
    	System.out.println("You have selected NO!");
    }else {
    	System.out.println("I am soooo confused. Please enter another reponse");
    }
	}
}
