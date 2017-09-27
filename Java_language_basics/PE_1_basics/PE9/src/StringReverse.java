import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		
		
		
		Scanner ne=new Scanner(System.in);
		System.out.println("Enter a word");
		
		String word=ne.next();
		
		
		char c;
		int a = word.length();
		
		for (int i=(a-1);i>=0;i--) {
			 c = word.charAt(i);
			
			System.out.print(c);
		}
	}

}
