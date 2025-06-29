import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayListOfString {
    public static void main(String[] args) {
        //Write a program to sort an ArrayList of Strings in descending order.

        ArrayList<String> listString = new ArrayList<>();

        Collections.addAll(listString,"Camel", "Apple", "Banana");

        System.out.println(listString);

        Collections.sort(listString, Collections.reverseOrder() );

        System.out.println(listString);
    }
}
