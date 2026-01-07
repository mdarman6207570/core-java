package day_101_HasMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapDemo2 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> studentRecords = new HashMap<>();
		
		studentRecords.put(101, "Scott");
		studentRecords.put(102, "Smith");
		studentRecords.put(103, "Martin");
		studentRecords.put(104, "Aryan");
		
		System.out.println("Student Records : "+studentRecords);
		
		int searchId = 105;
		String studentName = studentRecords.get(searchId);
	
		Optional<String> optional = Optional.ofNullable(studentName);
		System.out.println(optional.orElse("Id is not available"));
		
		System.out.println(studentRecords.put(103, "Rahul"));
		System.out.println("Updated records :"+studentRecords);
		
		studentRecords.remove(104);
		System.out.println("Records after removal :"+studentRecords);
		
		int idToCheck = 101;
		System.out.println("Does ID :"+idToCheck+" exist ? :"+studentRecords.containsKey(idToCheck));
	    
		String nameToCheck = "Aryan";
		System.out.println("Does Name :"+nameToCheck+" exist ? :"+studentRecords.containsValue(nameToCheck));
	
	   
		System.out.println("Iterating through records :");
		for(Map.Entry<Integer, String> entry : studentRecords.entrySet())
		{
			System.out.println("ID : "+entry.getKey()+" ,Name: "+entry.getValue());
		}
		
		studentRecords.clear();
		System.out.println("All records cleared :"+studentRecords);
	}

}
