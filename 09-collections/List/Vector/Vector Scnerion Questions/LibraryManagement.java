package elc;

import java.util.Scanner;
import java.util.Vector;

import blc.Book;
import blc.Library;

public class LibraryManagement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Vector<Book> book = new Vector<Book>();
		book.add(new Book(101,"Core Java","Mr James"));
		book.add(new Book(102,"Adv Java","Mr Roberrt"));
		book.add(new Book(103,"Head First Java","Miss Kathy Sierra"));
		book.add(new Book(104,"Programming in C","Mr Denis"));
		
		Library lb = new Library();
		
		System.out.println("Select from the Menu :");
		System.out.println("\t1) Display Books Available in the Library :");
		System.out.println("\t2) Search a Book in the Library :");
		System.out.println("\t3) Issue a Book from the Library :");
		System.out.println("\t4) Exit from the application :");
		
		while(true)
		{
			System.out.println("Please Enter your Choice :");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice)
		{
		  case 1 ->
		  {
			 lb.displayAvailableBooks(book);
		  }
		  case 2 ->
		  {
			 lb.searchBook(book, sc);
			 
		  }
		  case 3 ->
		  {
			 lb.issueBook(book, sc);
			 
		  }
		  case 4 ->
		  {
			 System.out.println("Thank you for Visiting.. ");
			 System.exit(0);
			 
		  }
          default ->
          {
        	 System.out.println("Invalid choice!!!");
 			 System.exit(0);
          }
		}
		}	
	}

}
