

import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import org.apache.logging.log4j.Logger;

public class FactorCheaker {

    private static Logger logger = LogManager.getLogger("App.class");
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
  //try with logger
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");

        System.out.println("Please enter first number");

        int input1 = scanner.nextInt();

        System.out.println("Please enter second number");

        int input2 = scanner.nextInt();


        CheackFactor(input1, input2, (i, j)->i%j==0);


    }

    public static void CheackFactor(int i, int j, Test test)

    {

        if (test.perform(i, j))
            System.out.println("Yes bro "+i+" is a factor "+j);
        else
            System.out.println("No bro "+i+" is not a  factor "+j);


    }
}
