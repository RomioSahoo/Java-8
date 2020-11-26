package Java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InternIterationWorking {
	public static void main(String args[])
	{

	List<Integer> li = Arrays.asList(1, 2, 3, 4, 5);
	//ANANONYMOUS CLASS   
	//alternate method: another class implementing consumer interface
	Consumer<Integer> c=new Consumer<Integer>()
	{
		public void accept(Integer i)
		{
			System.out.print(i+" ");
		}
	};
	li.forEach(c);
	System.out.println();
	
	//using lambda expression
	Consumer<Integer> c1=i->System.out.print(i+" ");
	li.forEach(c1);
	
	System.out.println();
	//OR
	li.forEach(new Consumer<Integer>(){
		public void accept(Integer i)
		{
			System.out.print(i+" ");
		}
	});
	
		
		
	}
}
