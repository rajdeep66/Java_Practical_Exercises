



import java.util.*;

import java.util.Arrays;

public class pe6  {



    public static void main(String[] args) {

        String input1="Alice  Bluto  Eugene  Harry  Olive";
        String[] input=input1.split(" ");
        Arrays.sort(input);
        System.out.println("Sorted Array set:");
        for(int i=0;i<input.length;i++)
            System.out.println(input[i]);

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(input));


        Iterator itr = arrayList.iterator();


        while(itr.hasNext())
        {

            System.out.println(itr.next());


        }




    }
}
