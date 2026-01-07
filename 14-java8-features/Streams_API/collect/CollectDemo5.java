package collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectDemo5 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		Map<Boolean,List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(n -> n%2==0));
		
		collect.forEach((k,v) -> System.out.println(k+" : "+v));
	}
}
