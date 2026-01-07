import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int number = n;
        int rev=0;             //123
        while(n>0){
            rev = rev*10+n%10;
            n=n/10;
        }
        if(rev == number) System.out.println(number +" :is Palindrome");
        else System.out.println(number+" :is Not  Palindrome");
    }
}
