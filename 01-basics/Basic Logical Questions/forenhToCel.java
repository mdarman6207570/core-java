import java.util.Scanner;

public class forenhToCel {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter temp in forenheit :");
            int tempInForen = sc.nextInt();

            int celcius = ((tempInForen - 32)*5)/9;


            System.out.println("Temp in celcius= is: "+celcius);
        }
    }
