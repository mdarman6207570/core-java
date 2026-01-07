package day9;
import java.util.*;

import java.util.Scanner;

public class Q16_NumberCalculator {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        sc.nextLine(); // for  Consuming the leftover newline

        System.out.println("Choose operation: ADD / SUB / MUL / DIV");
        String op = sc.nextLine().toLowerCase();

        int result = switch (op) {
            case "add" -> a + b;
            case "sub" -> a - b;
            case "mul" -> a * b;
            case "div" -> {
                if (b == 0) {
                    System.out.println("Error: Division by zero.");
                    yield -1;
                } else {
                    yield a / b;
                }
            }
            default -> {
                System.out.println("Invalid operation.");
                yield -1;
            }
        };

        if (result != -1) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
