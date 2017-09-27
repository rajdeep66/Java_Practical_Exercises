package pe3;
import java.util.Scanner;  



public class LetterCheaker {

	public static void main(String[] args) {
		
		
Scanner ne=new Scanner(System.in); 
		
		
		System.out.println("Please enter a word ");
		
		String input=ne.next(); 
	
		
		System.out.println("You entered word is  "+input);

		for(int i=0;i<input.length();i++) {
			if("01234567890".indexOf(input.charAt(i)) >=0) {
				System.err.println("Alpha numeric word.");
				System.exit(1);
			}
			if("aeiou".indexOf(
					input.charAt(i)) >= 0) {
				System.out.print("Vowel ");
			}
			else {
				System.out.print("Consonent ");
			}
		}
	}
}
