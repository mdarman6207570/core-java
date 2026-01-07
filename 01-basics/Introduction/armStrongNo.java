class armStrongNo 
{
    public static void main(String[] a) 
    {
        int number = Integer.parseInt(a[0]);
      
        int originalNumber = number;
        int sum = 0;
        int n = 0;

        // Count number of digits
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            n++;
        }

        // Calculate sum of nth powers of its digits
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp /= 10;
        }
        
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
