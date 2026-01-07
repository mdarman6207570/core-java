package day_71_Basic_Exception;

import java.util.Scanner;

public class AreaCalculator 
{
    public static double calculateArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be > 0.");
        }
        return length * width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter length of rectangle: ");
            double length = sc.nextDouble();

            System.out.print("Enter width of rectangle: ");
            double width = sc.nextDouble();

            // Calculate area
            double area = calculateArea(length, width);
            System.out.println("Area of rectangle with length " + length + " and width " + width + " is: " + area);

        }
        catch (IllegalArgumentException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) 
        {
            System.out.println("Error: Invalid input. Please enter numeric values.");
        }
        finally 
        {
            sc.close();
        }
    }
}
