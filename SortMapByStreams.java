package assignments;

import java.util.HashMap;

//sort map by values using streams
public class SortMapByStreams {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"B");
		map.put(2,"A");
		map.put(3,"D");
		map.put(4,"C");
		
		System.out.println("Ascending order:(by values)");
		map.entrySet().stream().sorted((a,b)->a.getValue().compareTo(b.getValue())).forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
		System.out.println("Ascending order:(by keys)");
		map.entrySet().stream().sorted((a,b)->a.getKey().compareTo(b.getKey())).forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
		System.out.println("Descending order:(by values)");
		map.entrySet().stream().sorted((a,b)->b.getValue().compareTo(a.getValue())).forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
		System.out.println("Descending order:(by keys)");
		map.entrySet().stream().sorted((a,b)->b.getKey().compareTo(a.getKey())).forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
		System.out.println();
		//map.entrySet().parallelStream().sorted((a,b)->a.getValue().compareTo(b.getValue())).forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
	}

}
