package arrayList;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var fin = new FileInputStream("D:\\new\\Product.txt");
        var ois = new ObjectInputStream(fin);

        try(ois; fin) 
        {
            while (true) 
            {
                Product product = (Product) ois.readObject();
                System.out.println(product);
            }
        }
        catch (EOFException e) 
        {
            System.err.println("End of file has reached");
        }
    }
}
