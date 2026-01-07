package vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

record Player(Integer id,String name,Double basePrice)
{
	
}

class IPLTeam
{
	private String teamName;
	private List<Player> listOfPlayers;
	
	public IPLTeam(String teamName) 
	{
		super();
		this.teamName = teamName;
		listOfPlayers = new Vector<Player>();   //Composition
	}
	
	
	public void addPlayer(Player player)
	{
		listOfPlayers.add(player);
	}
	
	
	public void displayListOfPlayers()
	{
		System.out.println("List of players in "+teamName+" team :");
		listOfPlayers.forEach(System.out::println);
	}
	
	
	public void removePlayerBasedOnThePrice()
	{
		/*    This logic is ok  for deleting only one object    
		for(Player player : listOfPlayers)
		{
			if(player.basePrice() > 5000)
			{
				listOfPlayers.remove(player);
				break;
			}
		}
	*/
		Iterator<Player> iterator = listOfPlayers.iterator();
		while(iterator.hasNext())
		{
			Player player = iterator.next();
			
			if(player.basePrice() > 5000)
			{
				iterator.remove();
			}
		}
	}
}

public class VectorDemo7 
{
	public static void main(String[] args) 
	{
		IPLTeam team = new IPLTeam("SRH");
		
		team.addPlayer(new Player(23, "Pet Cummins", 6700D));
		team.addPlayer(new Player(25, "Abhishek", 5000D));
		team.addPlayer(new Player(29, "Head", 6000D));
		team.addPlayer(new Player(21, "Nitish", 4500D));
		
		team.displayListOfPlayers();
		team.removePlayerBasedOnThePrice();
		System.out.println("After removing player based on the price");
		team.displayListOfPlayers();
	}

}
