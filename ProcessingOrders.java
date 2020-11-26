package Java8.streamapi;

import java.util.stream.Stream;

public class ProcessingOrders {

	public static void main(String[] args) {
		
		Stream.of("d1","a1","d2","a2").filter(i->{
			System.out.println("Filter: "+i);
			return true;
		}).forEach(i->System.out.println("forEach: "+i));
		
		System.out.println();
		System.out.println();
		
		Stream.of("d1","a1","d2","a2").map(i->{
			System.out.println("Map :"+i);
		return i.toUpperCase();
		}).forEach(i->System.out.println("ForEach: "+i));
		
		System.out.println();
		System.out.println();
		
		Stream.of("d1","a1","d2","a2","d3").filter(i->{
			System.out.println("Filter: "+i);
			return i.startsWith("a");
		}).anyMatch(i->{
			System.out.println("anymatch: "+i);
			return i.startsWith("d");
		});
		
		System.out.println();
		System.out.println();
	
		Stream.of("d2","b2","a1","b3","c").map(i->{
			System.out.println("Map: "+i);
			return i.toUpperCase();
		}).anyMatch(i->{
			System.out.println("Filter: "+i);
			return i.startsWith("C");
		});

	}

}
