package assignments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class java11Strings {

	public static void main(String[] args) throws IOException {
		//String.repeat()
		String st=new String("Romio");
		System.out.println(st.repeat(5));
		
		//String.lines()
		String multiline="hello \n there \n how \n you \n doing";
		List<String> list=multiline.lines().collect(Collectors.toList());
		System.out.println(list);
		
		//String.isBlank()
		System.out.println("is blank:"+st.isBlank());
		System.out.println("1".isBlank());
		System.out.println("".isBlank()+" "+"".isEmpty());
		System.out.println("  ".isBlank()+" "+"  ".isEmpty());
		
		//String.strip()
		System.out.println(" Romio ".strip());
		System.out.println(" Romio ".stripLeading());
		System.out.println(" Romio ".stripTrailing());
		
		//Collection.toArray
		List<String> li=new ArrayList<>();
		li.add("A"); li.add("B"); li.add("C");
		
		String arr[]=li.toArray(String[]::new);
		for(String i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("element at index 1:"+arr[1]);
		
		//write string to file
		Path myfile=Path.of("myFile.txt");
		Files.writeString(myfile,multiline);
		
		//read from file
		String readFile=Files.readString(myfile);
		System.out.println("file contents:"+readFile);
		
		
		
		

	}

}
