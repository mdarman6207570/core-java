package stream_method;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectDemo2 
{
	public static void main(String[] args) 
	{
		List<String> listOfCity = Arrays.asList("Delhi","Indore","Kolkata","Pune","Hyderabad","Mumbai","Chennai","Ampt");
		
		Map<Integer,List<String>>collect = listOfCity.stream().collect(Collectors.groupingBy(String::length));
		collect.forEach((len,cities) -> System.out.println(len+" : "+cities));
	}
}
