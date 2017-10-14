
import java.util.Map;
import java.util.HashMap;


public class pe3_ {




    public static void main(String[] args) {
        String arr[] = {"a","b","c","d","a","c","c"};
        count1(arr);
    }

    private static void count1(String[] arr) {
        Map<String, Boolean> map = new HashMap<> ();
        for(String s: arr){
            if(map.containsKey (s)){
                map.put (s, true);
            }
            else{
                map.put (s, false);
            }
        }
        System.out.println(map);
    }










}
