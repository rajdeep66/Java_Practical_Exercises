
import java.util.Scanner;
import java.util.regex.Pattern;

public class pe5 {
    public static void main(String[] args) {

        System.out.println("please enter your input");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] str1=str.split(" ");

        int flag=0;

        for(String str2:str1)

        {


            if(str2.matches("Harry"))
                flag=1;
            else
                continue;

        }
        if(flag==1)
            System.out.println("Is Harry here ? true  ");
        else
            System.out.println("Is Harry here ? false  ");
    }




}



