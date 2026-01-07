package blc;

import java.util.Scanner;
import java.util.Vector;

public class Library 
{
	public void displayAvailableBooks(Vector<Book> book)
	{
		System.out.println("Available Books in the Library :");
		book.forEach(System.out::println);
	}
	
	public void issueBook(Vector<Book> book,Scanner sc)
	{
		System.out.println("Enter Book id which for Book issue : ");
		int id = Integer.parseInt(sc.nextLine());
		
     		Book e=null;
		 boolean found = false;
	        for (Book b : book) {
	            if (b.id()==id) 
	            {
	            	e=b;
	            	book.remove(e);
	                found = true;
	                break;
	            }
	        }

	        if (found)
	        	System.out.println("Issued: "+e);
	        else
			System.out.println("Book with ID "+id+" not found.");
	}
	
	
	public void searchBook(Vector<Book> book,Scanner sc)
	{
		System.out.println("Enter keyword to search by title or author: ");
		String keyword = sc.nextLine();
		Book e=null;
		 boolean found = false;
	        for (Book b : book) {
	            if (b.title().equalsIgnoreCase(keyword) || b.author().equalsIgnoreCase(keyword)) 
	            {
	            	e=b;
	                found = true;
	                break;
	            }
	        }

	        if (found)
	        	System.out.println("Found: "+e);
	        else
			System.out.println("No matching books found.");
		   
	}
}
