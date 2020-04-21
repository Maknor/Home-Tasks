package ClassWork.Week5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExAnton3 {

    long arrayListAddTiming() {

        List<Integer> list=new ArrayList<>();

        long startTime=System.currentTimeMillis();

        for(int i =0;i<1000000;i++){

            list.add(i);

        }

        long finishTime=System.currentTimeMillis()-startTime;

        return finishTime;

    }

    long linkedListAddTiming() {

        List<Integer> list=new LinkedList<>();

        long startTime=System.currentTimeMillis();

        for(int i =0;i<10000000;i++){

            list.add(i);

        }

        long finishTime=System.currentTimeMillis()-startTime;

        return finishTime;


    }

    public static void main(String[] args) {
        ExAnton3 ex=new ExAnton3();

        System.out.println("Время arrayList " +ex.arrayListAddTiming());

        System.out.println("Время linkedList " +ex.linkedListAddTiming());


    }


}
