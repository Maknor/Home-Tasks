package ClassWork.Week5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExAnton2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<Integer> numb = new HashSet<>();

        for (int i = 0; i < 3; i++) {

            System.out.println("Введите число: ");
            int data = scan.nextInt();

            if (data < 10) {
                numb.add(data);
            }


            numb.add(scan.nextInt());
            Iterator<Integer> iterator = numb.iterator();


        }


    }
}
