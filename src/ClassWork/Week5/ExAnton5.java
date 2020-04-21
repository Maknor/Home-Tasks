package ClassWork.Week5;
//Создать словарь типа «фамилия»-«зарплата» и удалить из него тех, у кого зарплата ниже 500 кредитов.
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ExAnton5 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();


        map.put("Ivan", 213);
        map.put("Alex", 673);
        map.put("Artem", 423);
        map.put("Oleg", 1243);
        map.put("Igor", 788);

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        Set<String> str = new HashSet<>();



        for (Map.Entry<String, Integer> me : set) {

            if (me.getValue()<500){

                str.add(me.getKey());

            }
        }

        for(String sr:str){

            map.remove(sr);

        }

        System.out.println(map);


    }
}