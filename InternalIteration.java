package Java8.streamapi;
import java.util.Arrays;
import java.util.List;

public class InternalIteration {

	    public static void main(String[] args){
//	    	List<Integer> li=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
	    	List<Integer> li=Arrays.asList(1,2,3,4,5,6);
	    	li.forEach(i->System.out.println(i));
	    	
	        List<String> alphabets = Arrays.asList(new String[]{"a","b","b","d"});
	        alphabets.forEach(l -> System.out.println(l.toUpperCase()));
	    }
	}


