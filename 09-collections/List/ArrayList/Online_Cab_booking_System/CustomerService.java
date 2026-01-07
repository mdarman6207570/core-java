package blc;
import java.util.ArrayList;

public class CustomerService 
{
    private ArrayList<Customer> customers;

    
    public CustomerService() 
    {
        customers = new ArrayList<>();
    }

    
    public void addCustomer(Customer customer) 
    {
        customers.add(customer);
    }

 
    private boolean isFirstCustomer(Customer customer) 
    {
        for (Customer c : customers) 
        {
            if (c.phone().equals(customer.phone())) 
            {
                return false; 
            }
        }
        return true; 
    }

   
    public double calculateBill(Customer customer) 
    {
        boolean firstTime = isFirstCustomer(customer);

        if (firstTime) 
        {
            addCustomer(customer); 
            return 0.0; 
        }
        else 
        {
            addCustomer(customer); 
            int distance = customer.distance();
            if (distance <= 4) 
            {
                return 80.0;
            }
            else 
            {
                return 80.0 + distance * 6.0;
            }
        }
    }

  
    public void printBill(Customer customer) 
    {
        double bill = calculateBill(customer);
        System.out.println(customer.customerName().toUpperCase() + " Please pay your bill of Rs." +bill);
   }
}
