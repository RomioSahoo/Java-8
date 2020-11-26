package Java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public static void main(String[] args) {
	List<Person> person = Arrays.asList(new Person("Raj", 12), new Person("Vikram", 17), new Person("Megha", 15));
	List<Person> filtered=person.stream().filter(i->i.name.startsWith("V")).collect(Collectors.toList());
	System.out.println(filtered);
	
	
	
	}

}
