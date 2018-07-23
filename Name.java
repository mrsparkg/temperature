package temperature;
import java.util.Scanner;

public class Name {

	public static void main(String[] args) {

		System.out.println("Enter your name");
		
		var Scanner = new Scanner(System.in);
		String name =Scanner.nextLine();
		
		for(int i=0; i<8; i++) {
			System.out.println("Your name is "+ name);
		}
		

	}

}
