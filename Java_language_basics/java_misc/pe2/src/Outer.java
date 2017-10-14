public class Outer {
    public Outer(int age, String name) {




    }

    public inner OuterFunc(){
        inner obj2=new inner(15,"anybody");
       return null;
   }
    public static class inner {
       private int age;
       private String name;

        public inner(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }


    public static void main(String[] args) {
       inner obj=new inner(22,"rajdeep");
    }
}
