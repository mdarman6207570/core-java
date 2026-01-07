import java.util.Scanner;

public class sallary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic sallary:");
        int salary = sc.nextInt();

        int HRA = salary*15/100;
        int conveyanceAllowance = salary*15/100;
        int entertainmentAllowance = salary*10/100;

        int totalS = salary + HRA + conveyanceAllowance + entertainmentAllowance;
        System.out.println("Total sallary is: "+totalS);
    }
}
