public class pe3 {
      private  String name;
    public   pe3( String name) throws Exception
    {this.name=name;   }


    public static void main(String[] args)  {
        try{


            pe3 obj=new pe3("rajdeep");
    }
    catch (Exception e){
        System.out.println("inside catch");

        }
    finally {
            System.out.println("I am in finnaly");
        }
    }
}



