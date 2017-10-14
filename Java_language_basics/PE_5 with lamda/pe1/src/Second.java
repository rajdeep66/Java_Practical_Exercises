public class Second {

    public static First myMethod()

    {


return new First(6);
    }


    public static void main(String[] args) {
       Second second=new Second();
        System.out.println(  second.myMethod().i);



    }
}
