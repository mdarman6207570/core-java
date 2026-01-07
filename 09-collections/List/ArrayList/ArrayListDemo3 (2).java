package arrayList;


import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo3 {
    public static void main(String args[]) {
        List<String> listOfName = Arrays.asList("Rohit", "Akshar", "Pallavi", "Sweta"); // Length is fixed

        listOfName.sort((s1, s2) -> s1.compareTo(s2));

        // Fetching the data in both the directions
        ListIterator<String> lst = listOfName.listIterator();

        System.out.println("In Forward Direction..");
        while (lst.hasNext()) {
            System.out.println(lst.next());
        }

        System.out.println("In Backward Direction..");
        while (lst.hasPrevious()) {
            System.out.println(lst.previous());
        }
    }
}
