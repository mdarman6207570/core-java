package day9;
import java.util.*;

public class Q17_TypeOfDayFinder {
	public static void main(String[] argv) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day : ");
		String day = sc.nextLine().toLowerCase();
		
		String Day = switch(day) {
		case "monday" -> "Weekday";
		case "tuesday" -> "Weekday";
		case "wednesday" -> "Weekday";
		case "thursday" -> "Weekday";
		case "friday" -> "Weekday";
		case "saturday" -> "Weekend";
		case "sunday" -> "Weekend";
		default -> "Invalid Day";
		
		};
		
		if(Day == "Weekday")
		System.out.println(day.toUpperCase()+" is a Weekday");
		else if(Day == "Weekend") {
			System.out.println(day.toUpperCase()+" is a Weekend");
		}
		else {
			System.out.println(day.toUpperCase()+" is not a valid Day.");
		}
	}
}
