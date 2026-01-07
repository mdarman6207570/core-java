package arrayList;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationDemo {

    public static void main(String[] args) throws IOException {
        var sc = new Scanner(System.in);
        var fout = new FileOutputStream("D:\\new\\Product.txt");
        var oos = new ObjectOutputStream(fout);

        try(sc;fout;oos) 
        {
            System.out.println("Enter the number of Product Objects:");
            int noOfObj = Integer.parseInt(sc.nextLine());

            for (int i = 1; i <= noOfObj; i++) 
            {
                Product product = Product.getProductObject();
                oos.writeObject(product);
            }
            System.out.println("Product Object stored!!!");
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
