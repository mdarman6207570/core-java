package day_71_Drawback_of_new_keyword_in_Java___Reflection_API;

import java.util.Scanner;

public class ReflectionDemo 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        
        // Ask user for class name
        System.out.print("Enter class name: ");
        String className = sc.nextLine();

        // Load class dynamically
        Class<?> clazz = Class.forName(className);

        // Create object dynamically (no new keyword!)
        Object obj = clazz.getDeclaredConstructor().newInstance();

        System.out.println("Object created of type: " + obj.getClass().getName());
       sc.close();    }
}
