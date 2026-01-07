package string_methods;

public class StringMethodDemo 
{
    public static void main(String[] args) 
    {
        String str = "Hyderabad";
        char ch = str.charAt(8);
        System.out.println(ch);    // Output: d

        ch = str.charAt(9); // StringIndexOutOfBoundsException
    }
}
