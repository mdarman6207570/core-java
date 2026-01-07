package arraylist;

import java.util.ArrayList;

record Customer(Integer id, String name, Double sal)
{
}

public class ArrayListDemo2 {

    public static void main(String[] args)
    {
        ArrayList<Customer> listOfCustomer = new ArrayList<>();
        listOfCustomer.add(new Customer(111, "Scott", 800D));
        listOfCustomer.add(new Customer(222, "Smith", 1200D));
        listOfCustomer.add(new Customer(333, "Alen", 1800D));
        listOfCustomer.add(new Customer(444, "Martin", 1500D));
        listOfCustomer.add(new Customer(555, "John", 1300D));

        System.out.println("Original Data");
        listOfCustomer.forEach(System.out::println);

        System.out.println("Removing the 444 id :");

        listOfCustomer.removeIf(cust -> cust.id()==444);
        listOfCustomer.forEach(System.out::println);

        System.out.println("Sorting based on the salary (ascending).........");

        listOfCustomer.sort((c1, c2)->Double.compare(c2.sal(), c1.sal()));
        listOfCustomer.forEach(System.out::println);
    }

}