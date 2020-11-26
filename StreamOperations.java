package Java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperations {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Amithabh");
		list.add("Shekhar");
		list.add("Aman");
		list.add("Rahul");
		list.add("Shahrukh");
		list.add("Salman");
		list.add("Yana");
		list.add("Lokesh");
		
		//Stream.filter()
		list.stream().filter(i->i.startsWith("A")).forEach(System.out::println);
		
		System.out.println();
		
		//Stream.map()
		list.stream().filter(i->i.startsWith("Y")).map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println();
		
		//Stream.sorted()
		list.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println();
		
		//Stream.collect()
		List<String> li=list.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.print(li+" ");
		
		System.out.println();System.out.println();
		
		//Stream.match()
		boolean matchResult=list.stream().anyMatch(i->i.startsWith("A"));
		System.out.println(matchResult);
		
		boolean matchResult1=list.stream().allMatch(i->i.startsWith("A"));
		System.out.println(matchResult1);
		
		boolean matchResult2=list.stream().noneMatch(i->i.startsWith("A"));
		System.out.println(matchResult2);
		
		System.out.println();
		
		//Stream.count()
		Long count=list.stream().filter(i->i.startsWith("A")).count();
		System.out.println(count);
		
		//Stream.reduce()
		Optional<String> reduced=list.stream().reduce((s1,s2)->s1+" "+s2);
		reduced.ifPresent(System.out::println);
		
		System.out.println();
		
		//Stream.findFirst()
		String get=list.stream().filter(i->i.startsWith("A")).findFirst().get();
		System.out.println(get);
		
		System.out.println();
		
		//Get the collection and later convert to stream to process elements
		List<Integer> ints = IntStream.of(1,2,3,4,5)
		                .boxed()
		                .collect(Collectors.toList());
		         
		System.out.println(ints);
		
		Optional<Integer> max = IntStream.of(1,2,3,4,5)
                .boxed()
                .max(Integer::compareTo);
		max.ifPresent(System.out::println);
		
		
		
	}

}
