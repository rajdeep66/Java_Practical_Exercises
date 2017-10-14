import java.util.Scanner;

public class CalculateStringLength {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your input line ");

        String input=scanner.nextLine();


        printLength(input, ( s) -> s.length());






    }

    public static void printLength(String s,StringLenInterface stringLenInterface)

        {
            System.out.println(stringLenInterface.perform(s));
        }

}
