
import java.util.*;

public class pe1{
    public static void main(String[] args) {


        Integer[] array=new Integer[5];
        System.out.println("Enter the element to the Array");

        Scanner sc =new Scanner(System.in);

        for(int i=0;i<array.length;i++ )
            array[i]=sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(array));


        Iterator itr=arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
