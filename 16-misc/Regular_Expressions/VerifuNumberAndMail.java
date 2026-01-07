package string_method_demo;

import java.util.Scanner;

public class VerifuNumberAndMail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your mobile number :");
		String mobile = sc.nextLine();

		boolean isValid = mobile.matches("\\d{10}");
		System.out.println(mobile + " is a valid mobile number : " + isValid);

		System.out.println("Enter your email id :");
		String email = sc.nextLine();

		isValid = email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
		System.out.println(email + " is a valid email id : " + isValid);

		sc.close();
	}

}
