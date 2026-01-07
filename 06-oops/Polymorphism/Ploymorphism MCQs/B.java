package mcq;

class A 
{
   static void foo() 
   {
      System.out.println("A");
   }
}

class B extends A
{
	/*
   static int foo()                    //hiding not possible return type not same
   {
       System.out.println("B");
       return 1;
   }
   */
}