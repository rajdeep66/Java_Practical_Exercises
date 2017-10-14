
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pe6 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String given_string="se";
        System.out.println("enter a word");
        String input=sc.nextLine();




        Pattern check=Pattern.compile(given_string);
        Matcher check1=check.matcher(input);


        while(check1.find())

        {
            System.out.println(check1.start()+":"+check1.end());



        }


        }







    }



