
import java.util.Scanner;
import java.util.Arrays;

public class Sort {
   public static void main(String[] args) {
       System.out.println("enter the size of array");
       Scanner sc = new Scanner(System.in);
       int arrSize = sc.nextInt();
       System.out.println("enter the numbers");
       int[] num = new int[arrSize] ;
       for (int i =0; i < arrSize; i++){
           num[i] = sc.nextInt();
       }
       int start = 0;
       sort(num, arrSize, start );


   }

   private static void sort(int[] num, int arrSize, int start) {
       Arrays.sort(num);
       rev(num, arrSize, start);



   }

   private static void rev(int[] num, int arrSize, int start) {
       int j = arrSize-1;
       int temp;
       while (start < j){
           temp = num[start];
           num[start] = num[j];
           num[j] = temp;
           start++;
           j--;
       }
       for (int i = 0; i < arrSize;i++) {
           System.out.printf("%d",num[i]);
       }
       System.out.println("\n");
       sum(num,arrSize);

   }

   private static void sum(int[] num, int arrSize) {
       int sum =0;
       for (int i =0; i < arrSize; i++){
           if (num[i] % 2 == 0)
               sum = sum+num[i];
       }
       System.out.println("sum of even number is "+sum);
       if(sum > 15){
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }

   }
}