
import java.util.Scanner;
public class MyClass {


    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);


        System.out.println("Please enter a number");

        int input=scanner.nextInt();

        operation(input,());
    }



    public static void operation(int i,Multiply mult ){

        System.out.println(mult.multiply(i));

    }
}

