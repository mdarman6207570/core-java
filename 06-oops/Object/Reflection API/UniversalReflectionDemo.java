package day_71_Drawback_of_new_keyword_in_Java___Reflection_API;

import java.lang.reflect.*;
import java.util.*;

class Student2 {
    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("👩 Student -> Name: " + name + ", Age: " + age);
    }
}

class Teacher2 {
    private String name;
    private String subject;

    public Teacher2(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void show() {
        System.out.println("👨 Teacher -> Name: " + name + ", Subject: " + subject);
    }
}

public class UniversalReflectionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: Take class name
            System.out.print("Enter class name (Student2/Teacher2): ");
            String className = sc.nextLine();

            String packageName = "day_71_Drawback_of_new_keyword_in_Java___Reflection_API.";
            // Step 2: Load class dynamically
            Class<?> cls = Class.forName(packageName+className);

            // Step 3: List available constructors
            Constructor<?>[] constructors = cls.getConstructors();
            System.out.println("\nAvailable constructors:");
            for (int i = 0; i < constructors.length; i++) {
                System.out.println((i + 1) + ": " + constructors[i]);
            }

            // Step 4: Ask user to pick constructor
            System.out.print("\nChoose constructor (1-" + constructors.length + "): ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            Constructor<?> cons = constructors[choice - 1];
            Class<?>[] paramTypes = cons.getParameterTypes();

            // Step 5: Collect arguments from user
            Object[] argsForConstructor = new Object[paramTypes.length];
            for (int i = 0; i < paramTypes.length; i++) {
                System.out.print("Enter value for " + paramTypes[i].getSimpleName() + ": ");
                String input = sc.nextLine();

                if (paramTypes[i] == int.class) {
                    argsForConstructor[i] = Integer.parseInt(input);
                } else if (paramTypes[i] == double.class) {
                    argsForConstructor[i] = Double.parseDouble(input);
                } else if (paramTypes[i] == boolean.class) {
                    argsForConstructor[i] = Boolean.parseBoolean(input);
                } else {
                    argsForConstructor[i] = input; // default String or Object
                }
            }

            // Step 6: Create object dynamically
            Object obj = cons.newInstance(argsForConstructor);

            System.out.println("\n✅ Object created: " + obj.getClass().getName());

            // Step 7: If "show" method exists, call it
            try {
                Method showMethod = cls.getMethod("show");
                showMethod.invoke(obj);
            } catch (NoSuchMethodException e) {
                System.out.println("ℹ️ No show() method found in class " + className);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
