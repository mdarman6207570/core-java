package arrayList;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {

 // For backward compatibility
 private static final long serialVersionUID = 1L;

 private int id;
 private String name;
 private transient double price;

 public Product(int id, String name, double price) {
     super();
     this.id = id;
     this.name = name;
     this.price = price;
 }

 @Override
 public String toString() {
     return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
 }

 public static Product getProductObject() {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Product id: ");
     int id = Integer.parseInt(sc.nextLine());

     System.out.print("Enter Product Name: ");
     String name = sc.nextLine();

     System.out.print("Enter Product Price: ");
     double price = Double.parseDouble(sc.nextLine());

     return new Product(id, name, price);
 }
}
