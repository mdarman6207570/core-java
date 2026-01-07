package collection_mcqs;

import java.util.ArrayList;
import java.util.Vector;

public class Test18 
{
	public static void main(String[] args) 
    {
        Vector<Person2> v1 = new Vector<>();
        ArrayList<Person2> a1 = new ArrayList<>();

        v1.add(new Person2("Alice", 30));
        a1.add(new Person2("Alice", 30));

        System.out.println(v1.equals(a1));
        System.out.println(v1.hashCode());
        System.out.println(a1.hashCode());
    }
}

class Person2
{
    String name;
    int age;

    Person2(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

 }
