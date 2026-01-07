package day_71_Basic_Exception;

import java.util.Scanner;

public class DivisionExample 
{
    public static int performDivision(int a, int b) 
    {
        if (b == 0) {
            throw new ArithmeticException("Division by zero: dividend=" + a + ", divisor=" + b);
        }
        return a / b;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend : ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("Enter divisor : ");
        int b = Integer.parseInt(sc.nextLine());

        try
        {
            System.out.println("Result of division : " + performDivision(a, b));
        }
        catch (ArithmeticException e) 
        {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        sc.close();
    }
}
