package temperature;
import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {

	public static void main(String[] args) {
		
		System.out.println("Enter your name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		HashMap<String,String> phonebook =new HashMap<>();
		phonebook.put("Ahmed","13478497172");
		phonebook.put("Kpobi","233244580879");
		phonebook.put("Jemila","0244580579");
		phonebook.put("Reuben","18592020765");
		phonebook.put("Aisha","0204450795");
		phonebook.put("Petter", "0595362647");
		
		
			
			System.out.println("Your phone number is "+phonebook.get(name));
		

	}

}
