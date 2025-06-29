import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(12);
        numList.add(1);
        numList.add(34);
        numList.add(23);
        numList.add(5);
        numList.add(23);


        Collections.sort(numList);
        for (Integer i : numList) {
            System.out.print(i+" ");
        }
        System.out.println();

        Collections.addAll(numList,12,23,23,6,35,34,23,6,6);
        for (Integer i : numList) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println(numList);
        numList.add(1,2);
        System.out.println(numList);

        numList.set(1,100);
        System.out.println(numList);

        numList.remove((Integer)100);
        System.out.println(numList.remove(Integer.valueOf(500)));
        System.out.println(numList);
        numList.remove(1);
        System.out.println(numList);

        boolean ans = numList.contains((Integer)2);
        System.out.println(ans);

        ArrayList l = new ArrayList();
        l.add(12);
        l.add("pew");
        l.add(true);
        l.add(12.23f);
        System.out.println(l);
    }
}
