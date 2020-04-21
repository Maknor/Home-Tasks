package ClassWork.Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("Car");
        list.add("Airplane");
        list.add("Phone");
        list.add("Computer");
        list.add("Mouse");

        list.remove(4);

        Collections.reverse(list);

        System.out.println(list);
    }
}