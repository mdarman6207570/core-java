package arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>(20);

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);

        int sum = 0;

        for(Integer number : numbers)
        {
            sum = sum + number;
        }

        System.out.println("Sum of all elements are :"+sum);

    }

}
