package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

record Player(Integer id,String name)
{
	
}

public class MapDemo3 
{
	public static void main(String[] args) 
	{
		//get the name of the Player in upper case from Player where duplicate should not be there
		
		Set<String> collect = createPlayerlist().stream().map(player -> player.name().toUpperCase()).collect(Collectors.toSet());
	    collect.forEach(System.out::println);
	}

	public static List<Player> createPlayerlist()
	{
		List<Player> al = new ArrayList<>();
		al.add(new Player(18, "Virat"));
		al.add(new Player(45, "Rohit"));
		al.add(new Player(7, "Dhoni"));
		al.add(new Player(18, "Virat"));
		al.add(new Player(90, "Bumrah"));
		al.add(new Player(67, "Hardik"));
		
		return al;
	}
}
