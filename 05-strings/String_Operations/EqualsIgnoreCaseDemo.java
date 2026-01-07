package string_methods;

public class EqualsIgnoreCaseDemo 
{
	public static void main(String[] args) {
        String username = "ravi";

        if (username.equalsIgnoreCase("Ravi"))
            System.out.println("Welcome Ravi");
        else
            System.out.println("Sorry! wrong username / Password");
    }
}
