package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValue {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map1=new HashMap<>();
		LinkedHashMap<Integer,String> map2=new LinkedHashMap<>();
		map1.put(3,"D");
		map1.put(5,"B");
		map1.put(1,"A");
		map1.put(7,"C");
		
		List<Integer> keys=new ArrayList<>(map1.keySet());
		List<String> values=new ArrayList<>(map1.values());
		
		int size=keys.size();
		int i=0, mkey=0;
		Collections.sort(values);
		while(i<size) {
			String st=values.get(i);
			for(int key:keys) {
				if(map1.get(key).equals(st))
					mkey=key;
			}
			map2.put(mkey,st);
			i++;
		}
		System.out.println(map2);
		System.out.println();
		for(Map.Entry m:map2.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	
	}

}
