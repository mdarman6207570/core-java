package day_71_Drawback_of_new_keyword_in_Java___Reflection_API;

import java.lang.reflect.*;
import java.util.Scanner;

// First class
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("👩 Student -> Name: " + name + ", Age: " + age);
    }
}

// Second class
class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void show() {
        System.out.println("👨 Teacher -> Name: " + name + ", Subject: " + subject);
    }
}

// Main program
public class ReflectionDynamicDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Take class name from user
            System.out.print("Enter class name (Student/Teacher): ");
            String className = sc.nextLine();

            // Load class dynamically
            String packageName = "day_71_Drawback_of_new_keyword_in_Java___Reflection_API.";
            Class<?> cls = Class.forName(packageName + className);
           

            // Check which class
            if (className.equals("Student")) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine();

                System.out.print("Enter student age: ");
                int age = sc.nextInt();

                Constructor<?> cons = cls.getConstructor(String.class, int.class);
                Object obj = cons.newInstance(name, age);

                cls.getMethod("show").invoke(obj);

            } else if (className.equals("Teacher")) {
                System.out.print("Enter teacher name: ");
                String name = sc.nextLine();

                System.out.print("Enter subject: ");
                String subject = sc.nextLine();

                Constructor<?> cons = cls.getConstructor(String.class, String.class);
                Object obj = cons.newInstance(name, subject);

                cls.getMethod("show").invoke(obj);

            } else {
                System.out.println("❌ Unsupported class: " + className);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Class not found!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
