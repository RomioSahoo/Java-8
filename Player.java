package Java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Question2
/*Give a ArrayList of Players -  List<Player> . Take a Player pojo with String Name, Int age, and Int runs. Build a list using list.add.
           a. Find the first player whose age is less than 30 and Runs greater than 5000 and print the name. or else print "No player selected for world cup"
           b. For the same example find first 3 players and result should be a new list with three players*/
public class Player {
	String name;
	int age;
	int runs;
	
	public Player(String name, int age, int runs) {
		super();
		this.name = name;
		this.age = age;
		this.runs = runs;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}
	
	public static void main(String[] args) {
		//A
		List<Player> players=Arrays.asList(new Player("Sachin",45,10252),new Player("Virat",29,7000),new Player("Dhoni",38,4000),new Player("Yuvraj",29,5500));
		List<Player> filtered=players.stream().filter(i->i.runs>5000 && i.age<30).collect(Collectors.toList());
		if(filtered.isEmpty())
			System.out.println("No Player selected for World Cup");
		else
			System.out.println(filtered);
		
		System.out.println();
		
		//B
		List<Player> firstThree=players.stream().limit(3).collect(Collectors.toList());
		System.out.println(firstThree+" ");
		
		
	}

}
