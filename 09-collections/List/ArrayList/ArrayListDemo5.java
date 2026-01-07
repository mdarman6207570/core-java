package arrayList;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo5 
{
    public static void main(String[] args) 
    {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Chennai");

        System.out.println("Before sorting: " + cities);

        cities.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("After sorting (Ascending): " + cities);

        cities.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("After sorting (Descending): " + cities);
    }
}
