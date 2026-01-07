package day_7;
import java.util.*;

 public class Q1 {
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any no:");
	int n = sc.nextInt();
	if(n>10 && n<100) {
		System.out.println("Sum of no is: "+(n%10 + n/10));
	}else if(n<0) {
		System.out.println(-3);
	}else if(n>99) {
	System.out.println(-2);
	}else {
		System.out.println(-1);
	}
  }
}
