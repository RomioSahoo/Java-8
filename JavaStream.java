package Java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {
		//creating stream of a fixed number of integers
		Stream<Integer> stream1=Stream.of(1,2,3,4,5,6,7,8,9,10);
		stream1.forEach(i->System.out.print(i+" "));
		
		System.out.println();
		
		//stream from an array
		Stream<String> stream2=Stream.of(new String[] {"Romio","Ranjan","Sahoo"});
		stream2.forEach(i->System.out.print(i+" "));
		
		System.out.println();
		
		//stream from the List
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=10;i+=1)
			list.add(i);
		Stream<Integer> stream3=list.stream();
		stream3.forEach(i->System.out.print(i+" "));
		
		System.out.println();
		
		//stream from the set
		Set<String> set=new TreeSet<String>();
		set.add("a");set.add("z");set.add("e");
		Stream<String> stream4=set.stream();
		stream4.forEach(i->System.out.print(i+" "));
		
		System.out.println();
		
		//Stream of String chars and tokens
		Stream<String> stream5=Stream.of("A$B$C".split("\\$"));
		stream5.forEach(i->System.out.print(i.toLowerCase()+" "));
		
		System.out.println();
		
		//Stream.generate()	
		Stream<Integer> randomNumbers=Stream.generate(()->(new Random()).nextInt(10));
		randomNumbers.limit(5).forEach(System.out::println);
		
		//collect stream elements to list
		Stream<Integer> stream6=list.stream();
		List<Integer> evenNumbersList=stream6.filter(i->i%2==0).collect(Collectors.toList());
		System.out.print(evenNumbersList+" ");
		
		System.out.println();
		
		//collect stream elements to set
		Stream<String> stream7=set.stream();
		Set<String> alp=stream7.collect(Collectors.toSet());
		System.out.print(alp+" ");
		
		System.out.println();
		
		//collect stream elements to array
		Stream<Integer> stream8=list.stream();
		Integer[] even=stream8.filter(i->i%2==0).toArray(Integer[]::new);
		System.out.print(Arrays.toString(even)+" ");
		
		System.out.println();System.out.println();
		
		//mapToInt
		Stream.of("a1","a2","a5").map(i->i.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
		
		System.out.println();
		
		//mapToObj
		IntStream.range(1,4).mapToObj(i->"a"+i).forEach(System.out::println);
		
		System.out.println();
		
		//stream of doubles is first mapped to an int stream and than mapped to an object stream of strings
		Stream.of(1.0,2.0,3.0).mapToInt(Double::intValue).mapToObj(i->"a"+i).forEach(System.out::println);
		

		
		
	
		
		
		
		
		
		
	}

}
