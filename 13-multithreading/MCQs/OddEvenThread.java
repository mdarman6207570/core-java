package day_83_ITC;

class SharedPrinter 
{
    private boolean isOdd = false;

    synchronized void printOdd(int number) 
    {
        while (isOdd) 
        {
            try 
            { 
              wait(); 
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace(); 
            }
        }
        System.out.println("Odd: " + number);
        isOdd = true;
        notify();
    }

    synchronized void printEven(int number) 
    {
        while (!isOdd) 
        {
          try
            { 
               wait(); 
            }
            catch (InterruptedException e) 
            {
              	e.printStackTrace(); 
            }
        }
        System.out.println("Even: " + number);
        isOdd = false;
        notify();
    }
}

public class OddEvenThread 
{
    public static void main(String[] args) 
    {
        SharedPrinter printer = new SharedPrinter();

        Thread oddThread = new Thread(() -> 
        {
            for (int i = 1; i <= 10; i += 2)
                printer.printOdd(i);
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2)
                printer.printEven(i);
        });

        oddThread.start();
        evenThread.start();
    }
}
