
import java.util.Map;
import java.util.HashMap;
public class pe2 {

    public static void main(String[] args) {
        String str = "one one -one___two,,three,one @three*one?two";
int count1,count2,count3;
count1=count2=count3=0;
//        String[] str1=str.split()
        for (int i = 0; i < str.length()-2; i++)
        {  if((str.charAt(i)=='o')&&(str.charAt(i+1)=='n')&&(str.charAt(i+2)=='e'))
            count1++;}
        for (int i = 0; i < str.length()-2; i++)
        {  if((str.charAt(i)=='t')&&(str.charAt(i+1)=='w')&&(str.charAt(i+2)=='o'))
            count2++;}
        for (int i = 0; i < str.length()-2; i++)
        {  if((str.charAt(i)=='t')&&(str.charAt(i+1)=='h')&&(str.charAt(i+2)=='r'))
            count3++;}
//        System.out.println(count1);
//        System.out.println(count2);
//        System.out.println(count3);

//
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("one",count1);
        map.put("two",count2);

        map.put("three",count3);
        for(Map.Entry<String,Integer> m:map.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }

    }
}
