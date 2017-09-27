public class Student {




     private String name;
    private int  age;
    private int id;

    public Student(int i, String n, int a){
        id=i;name=n;age=a;
    }

public void setter(int id,int age,String name ){
    this.age=age;
    this.id=id;
    this.name=name;}

public int getId()
{return this.id;}


public int getAge()
{return this.age;}


public String getName()
{return this.name;}
}





