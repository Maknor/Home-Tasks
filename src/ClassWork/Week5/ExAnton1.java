package ClassWork.Week5;

import java.util.HashSet;
import java.util.Set;

public class ExAnton1 {

    public static void main(String[] args) {

        Set<String> set=new HashSet<>();

        set.add("Авто");
        set.add("банан");
        set.add("груша");
        set.add("Груша");
        set.add("Дыня");

        System.out.println(set);

    }
}