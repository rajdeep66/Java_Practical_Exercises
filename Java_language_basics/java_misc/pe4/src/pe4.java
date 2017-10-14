import java.util.Scanner;

public class pe4 {


    public static void main(String[] args) {


       pe4 p=new pe4();

       try{
           int[] array=new int[-4];

           {array[-1]=1;}
           System.out.println(array[-1]);

       }
       catch (NegativeArraySizeException e){

           System.out.println("you entered a negative size");





       }

       try{

           int[] array=new int[4];

           for(int i=(1);i<=4; i++)

               array[i]=1;

       }
       catch (IndexOutOfBoundsException e){
        System.out.println("Max size is 4");}

        try{

            System.out.println(p);

        }
        catch (NullPointerException e)
        {System.out.println("you entered a negative size");}

        finally {
            System.out.println("Go to hell");
        }





    }

}



