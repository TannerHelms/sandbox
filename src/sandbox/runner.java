package sandbox;

public class runner {

	
	public static void main(String[] args) {
		int numberBits = 10;
		int bite = 8;
		int nibble = 4;
		int byteAnswer=0, byteReminder=0; 
		byteAnswer = numberBits / bite;
		byteReminder = numberBits % 8;
		
		
	System.out.println("bits = " + numberBits + " bytes = " + byteAnswer + " remainder = " + byteReminder);
	}
}
