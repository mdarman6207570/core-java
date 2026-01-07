package arrayList;


import java.util.ArrayList;

public class ArrayListDemo8 
{
    public static void main(String[] args) 
    {
        ArrayList<String> original = new ArrayList<>();
        original.add("BCA");
        original.add("MCA");
        original.add("BBA");

        System.out.println("Copy the Original Data by using Clone & Copy constructor");
        System.out.println("By using Clone Method:");

        @SuppressWarnings("unchecked")
        ArrayList<String> cloned = (ArrayList<String>) original.clone();
        System.out.println(cloned);

        System.out.println("By using Copy Constructor:");
        ArrayList<String> copy = new ArrayList<>(original);
        System.out.println(copy);
    }
}
