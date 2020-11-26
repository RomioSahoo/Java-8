package assignments;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {

	public static void main(String[] args) {
	
		HashMap<Integer,String> map=new HashMap<>();
		map.put(3,"A");
		map.put(0, "C");
		map.put(2,"B");
		map.put(1, "D");
		
		System.out.println("sort by keys");
		//sort by keys
		Map<Integer,String> map1=new TreeMap<>(map);
		for(Map.Entry m:map1.entrySet()) {
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		
		//sort by values
		//extract HashMap and input them into ArrayList
		 List<Map.Entry<Integer,String> > list = new LinkedList<>(map1.entrySet()); 
	  
	        Collections.sort(list, new Comparator<Map.Entry<Integer,String> >() { 
	            public int compare(Map.Entry<Integer,String> o1,  
	                               Map.Entry<Integer,String> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	        }); 
	          
	        
	        HashMap<Integer,String> fin = new LinkedHashMap<Integer,String>(); 
	        for (Map.Entry<Integer,String> aa : list) { 
	            fin.put(aa.getKey(), aa.getValue()); 
	        } 
	        System.out.println("sort by values");
	        for(Map.Entry mef: fin.entrySet())
	        	System.out.println(mef.getKey()+"\t"+mef.getValue());
		

	}

}
