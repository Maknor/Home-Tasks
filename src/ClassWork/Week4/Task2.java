package ClassWork.Week4;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for(int i=1;i<6;i++){
            System.out.print("Введите "+i+" слово\n>");
            list.add(scanner.nextLine());
        }

        list.remove(2);

        Collections.reverse(list);
        for(String s:list){
            System.out.print(s+" ");
        }
    }
}
