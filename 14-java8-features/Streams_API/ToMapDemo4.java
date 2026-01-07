package stream_method;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

record Trainer(Integer id,String name,Double salary)
{
	
}

public class ToMapDemo4 
{
	public static void main(String[] args) 
	{
		ArrayList<Trainer> listOfTrainer = new ArrayList<Trainer>();
		listOfTrainer.add(new Trainer(111, "Scott", 350000D));
		listOfTrainer.add(new Trainer(222, "Smith", 322000D));
		listOfTrainer.add(new Trainer(333, "Alen", 367000D));
		listOfTrainer.add(new Trainer(444, "John", 349000D));
		listOfTrainer.add(new Trainer(111, "Ravi", 350000D));
		
		Map<Integer,String> collect = listOfTrainer.stream().collect(Collectors.toMap(Trainer::id, Trainer::name,(oldkey,newkey) -> newkey,LinkedHashMap::new)); 
			
		collect.forEach((k,v)->System.out.println(k+" : "+v));
	}

}
