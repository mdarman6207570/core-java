package dentity_HashMap__SortedSet_Interface_Method__SortedMap_Interface;

public class SystemHashCode 
{
	public static void main(String[] args) 
	{
		String str1 = new String("Java");
		String str2 = new String("Java");
		
	   System.out.println("Overridden HashCode from String class :");
	   System.out.println(str1.hashCode()+" : "+str2.hashCode());
	
	   System.out.println("System HashCode from String class :");
	   System.out.println(System.identityHashCode(str1));
	   System.out.println(System.identityHashCode(str2));
	}

}
