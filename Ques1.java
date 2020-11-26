package Java8.streamapi;

//Question1
/*Given an ArrayList of companies - Lenovo, Dell, Acer, Samsung, Oppo, Oneplus, HTC, Intel, null, Microsoft, Jetbrains, Titan, Fossil.  Use list.add keyword to build a list with these values.
            a. Using the streams API, filter out nulls (use method reference)
            b. Filter companies which has length more than 4 (Lamdda expression)
            c. Transform them to UPPERCASE. 
            c. Sort them alphabetically
            d. Result should be a new list with filtered values.*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ques1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Lenovo");
		list.add("Dell");
		list.add("Acer");
		list.add("Samsung");
		list.add("Opo");
		list.add("Oneplus");
		list.add("HTC");
		list.add("Intel");
		list.add("");
		list.add("Microsoft");
		list.add("Jetbrains");
		list.add("Titan");
		list.add("Fossil");

		// Using the streams API, filter out nulls (use method reference)
		List<String> li1 = list.stream().filter(st -> st != null).collect(Collectors.toList());
		System.out.print(li1 + " ");

		System.out.println();
		System.out.println();

		// Filter companies which has length more than 4 (Lambda expression)
		list.stream().filter(i -> i.length()> 4).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println();

		// Transform them to UPPERCASE.
		List<String> li2 = list.stream().filter(str -> str != null).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.print(li2 + " ");

		System.out.println();

		// Sort them alphabetically
		list.stream().sorted().forEach(System.out::println);

		System.out.println();

		// Result should be a new list with filtered values
		List<String> list3 = list.stream().filter(i -> i.startsWith("L")).collect(Collectors.toList());
		System.out.print(list3 + " ");

	}

}
