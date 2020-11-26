package assignments;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream {

	public static void main(String[] args) {
		List<Integer> li1=Arrays.asList(1,3,5,7);
		List<Integer> li2=Arrays.asList(2,4,6,8);
		List<Integer> li3=Arrays.asList(0,0,0,0);
		List<List<Integer>> liF=Arrays.asList(li1,li2,li3);
		System.out.println("using map");
		liF.stream().map(i->i).forEach(System.out::println);
		System.out.println("using flatMap");
		//liF.stream().flatMap(i->i.stream()).forEach(i->System.out.println(i));
		Stream<Integer> stream=	liF.stream().flatMap(i->i.stream());
		System.out.println(stream.collect(Collectors.toList()));
		
		int res=li1.stream().reduce((a,b)->a+b).orElse(-1);
		System.out.println("sum:"+res);
		
		AtomicInteger count=new AtomicInteger();
		int sum=li1.stream().reduce((a,b)->{
			count.getAndIncrement();
			System.out.println("count:"+count+" a="+a+" b="+b+" sum="+(a+b));
			return a+b;
		}).orElse(-1);
		System.out.println(sum);
		
		
		Optional<Integer> oi=li1.stream().reduce((a,b)->a+b);
		if(oi.isPresent())
			System.out.println("sum:"+oi.get());
		else
			System.out.println("Invalid");
		
		Optional<Integer> max = IntStream.of(1,2,3,4,5)
                .boxed()
                .max(Integer::compareTo);
		max.ifPresent(System.out::println);
		
		
		

	}

}
