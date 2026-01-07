package elc;

import blc.Customer;
import blc.CustomerService;

public class CabCustomerServiceTester 
{
    public static void main(String[] args) 
    {
        CustomerService service = new CustomerService();
        
        try {
            // Test Case 1
            Customer c1 = new Customer(1, "John", "Ameerpet", "Madhapur", 5, "9876543210");
            service.printBill(c1); // Expected: 0.0

            // Test Case 2
            Customer c2 = new Customer(2, "Smith", "Panjagutta", "Kondapur", 6, "9876501234");
            service.printBill(c2); // Expected: 0.0

            // Test Case 3 (Existing Customer)
            Customer c3 = new Customer(3, "John", "Ameerpet", "Kukatpally", 7, "9876543210");
            service.printBill(c3);
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        }
        
        
        
        try 
        {
            new Customer(0, "Tom", "Ameerpet", "Madhapur", 4, "9876543210");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // ID validation
        }

        try {
            new Customer(1, " ", "Ameerpet", "Madhapur", 4, "9876543210");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Name validation
        }

        try {
            new Customer(2, "Sam", "", "Madhapur", 4, "9876543210");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Pickup validation
        }

        try {
            new Customer(3, "Lisa", "Ameerpet", null, 4, "9876543210");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Drop validation
        }

        try {
            new Customer(4, "Mark", "Ameerpet", "Madhapur", -3, "9876543210");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Distance validation
        }

        
    }
}


/*
       

        // Validation Test Cases
        
 */ 