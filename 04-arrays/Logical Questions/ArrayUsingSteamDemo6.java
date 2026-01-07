package array_using_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUsingSteamDemo6 
{
	public static void main(String[] args) 
	{
		String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
       
		
		 List<String> palindromeWords = Arrays.stream(words)
                .filter(word -> word.equals(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());
		 
		
		
		//List<String> palindromeWords = Arrays.stream(words).filter(word -> ArrayUsingSteamDemo6.checkPalindrome(word) ).collect(Collectors.toList());
	    System.out.println("Palindrome String : "+palindromeWords);
	}
	
//	public static boolean checkPalindrome(String word)
//	{
//		String name = new StringBuilder(word).reverse().toString();
//		return word.equals(name);
//	}
}
