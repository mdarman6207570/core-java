package hashset;


import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo4 
{
	public static void main(String[] args) 
	{
		HashSet<String> hashSet = new HashSet<String>();
		Scanner sc = new Scanner(System.in);

		while (true) 
		{
			System.out.println("Options:");
			System.out.println("1. Add element");
			System.out.println("2. Delete element");
			System.out.println("3. Display element");
			System.out.println("4. Exit");

			System.out.println("Enter your choice (1/2/3/4): ");
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) 
			{
			case 1 -> 
			{
				System.out.println("Enter the element to add: ");
				String elementToAdd = sc.next();
				if (hashSet.add(elementToAdd)) 
				{
					System.out.println("Element added Successfully");
				} 
				else 
				{
					System.out.println("Element already exists in the HashSet");
				}
			}

			case 2 -> 
			{
				System.out.println("Enter the element to delete");

				String elementToDelete = sc.nextLine();
				if (hashSet.remove(elementToDelete)) 
				{
					System.out.println("Element deleted Successfully");
				}
				else 
				{
					System.out.println("Element not found in the HashSet");
				}
			}

			case 3 -> 
			{
				System.out.println("Elements int the HashSet:");
				hashSet.forEach(System.out::print);
			}
			case 4 ->
			{
				System.out.println("Existing the program.");
				sc.close();
				System.exit(0);
			}
			default -> 
			{
				System.out.println("Invalid choice . Please Try again...");
			}
			}
			System.out.println();
		}
	}

}
