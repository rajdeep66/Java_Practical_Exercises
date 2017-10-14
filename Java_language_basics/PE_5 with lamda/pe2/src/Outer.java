public class Outer {




    public static class Inner{
        String string;

        public String getString() {
            return string;
        }

        public Inner(String string) {
            this.string = string;
        }
    }




    static public Inner returnInnerObject(Inner inner){

        return inner;
    }

    public static void main(String[] args) {



        Inner inner = new Inner("yo yo i am a value of Inner class");


      Inner inner1=  returnInnerObject(inner);

        System.out.println(inner1.getString());
    }
}
