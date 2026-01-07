package elc;

import java.util.Scanner;

import blc.DayScholar;
import blc.Hosteller;

public class StudentFeesCalculation 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1) Hosteller Student :");
		System.out.println("2) DayScholer Student :");
		int opt = Integer.parseInt(sc.nextLine());
		
	switch(opt) {
		case 1:{
			System.out.println("You have selected Hosteller!!!");
			System.out.println("Enter Student Id :");
			int sId = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Student Name :");
			String sName = sc.nextLine();
			
			System.out.println("Enter Exam Fees :");
			double sExamFee = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Hostel Fee :");
			double hostelFee =  Double.parseDouble(sc.nextLine());
			
			
			if(sId<=0) {
				System.out.println("Student Id cannot be zero OR -ve");
				System.exit(0);
			}
			else if(sName.length()<=0) {
				System.out.println("Name cannot be null or blank");
				System.exit(0);
			}
			else if(sExamFee<0) {
				System.out.println("Exam fees cannot be negative");
				System.exit(0);
			}
			
			
			System.out.println("Enter your total Fees :");
			double totalFee =  Double.parseDouble(sc.nextLine());
			
			 Hosteller h = new  Hosteller(sId,sName,sExamFee,hostelFee); 
			 h.payFee(totalFee);
			 System.out.println(h);
			 break;
		}
		case 2: {
			System.out.println("You have selected Day Scholler!!!");
			System.out.println("Enter Student Id :");
			int sId = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Student Name :");
			String sName = sc.nextLine();
			
			System.out.println("Enter Exam Fees :");
			double sExamFee = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Transport Fee :");
			double transportFee =  Double.parseDouble(sc.nextLine());
			
			
			if(sId<=0) {
				System.out.println("Student Id cannot be zero OR -ve");
				System.exit(0);
			}
			else if(sName.length()<=0) {
				System.out.println("Name cannot be null or blank");
				System.exit(0);
			}
			else if(sExamFee<0) {
				System.out.println("Exam fees cannot be negative");
				System.exit(0);
			}
			
			
			System.out.println("Enter your total Fees :");
			double totalFee =  Double.parseDouble(sc.nextLine());
			
			DayScholar d = new DayScholar(sId, sName, sExamFee, transportFee);
			d.payFee(totalFee);
			System.out.println(d);
			break;
		}
		default : System.out.println("Invalid selection");
		}
	
	sc.close();
	}
}
