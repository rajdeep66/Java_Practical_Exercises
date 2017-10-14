
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class Sequence {



    public static int getNumber(){

        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter a number");

        int input= scanner.nextInt();
        return input-1;//-1 as if a user input is 15 we should print from 14

    }

public static class ReverseSequenceSelector implements Selector{
       Sequence sequence=new Sequence();
    @Override
    public void current() {


    }

    @Override
    public void end() {

    }


    @Override
    public void next() {

      for(int i=getNumber();i>=0;i--)
          System.out.println(i);


    }


}



}
