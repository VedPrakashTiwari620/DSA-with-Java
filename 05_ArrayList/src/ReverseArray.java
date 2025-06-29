import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {

    static void reverse(ArrayList list){
        int i=0;
        int j=list.size()-1;

        while (i<j){
            Integer temp= (Integer)list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5,6);
        Collections.reverse(list);
        System.out.println(list);

        reverse(list);
        System.out.println(list);



    }
}
