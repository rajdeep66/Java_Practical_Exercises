
import java.util.*;


public class Maintest {

    public static void main(String[] args) {
        Student[]
        student = {
                new Student(11,"a1", 32),
                new Student(12,"a1", 12),
                new Student(13,"a1", 52),
                new Student(15,"a1", 21),
                new Student(14,"a1", 21),

        };
        ArrayList<Student> arrayList = new ArrayList<Student>(Arrays.asList(student));


        Collections.sort(arrayList, new StudentSorter());
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i).getName() + " age: " + arrayList.get(i).getAge() + " id: " + arrayList.get(i).getId());
        }

    }



}
