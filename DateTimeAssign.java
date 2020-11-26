package assignments;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateTimeAssign {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter entry date:(Y-M-D)");
		String tm=sc.nextLine();
		System.out.println("Enter fair per day");
		int fair=sc.nextInt();

		LocalDate entryTime=LocalDate.parse(tm);
		LocalDate exitTime=LocalDate.now();
		
		System.out.println(exitTime.getDayOfWeek());
		
		Period diff=Period.between(entryTime, exitTime);
		
		int days=diff.getDays();
		long total=days*fair;
		System.out.println("Money to pay:"+total+" for "+days+" days of stay");
		
		
		
	}

}
