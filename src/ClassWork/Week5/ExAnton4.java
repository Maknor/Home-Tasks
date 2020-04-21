package ClassWork.Week5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExAnton4 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();


        map.put(1,"один");
        map.put(2,"фваф");
        map.put(3,"выаыв");
        map.put(4,"цуам");
        map.put(5,"ывауц");
        map.put(6,"выфпрне");

        Set<Map.Entry<Integer, String>> set = map.entrySet();



        for (Map.Entry<Integer, String> entry : set) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }


    }

}
