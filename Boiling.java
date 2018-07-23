package temperature;
import java.util.Scanner;

public class Boiling {

	public static void main(String[] args) {
		System.out.println("Give temperature in Celsius :");
		Scanner sc= new Scanner(System.in);
		double celsius=sc.nextDouble();
		
		if (celsius<=0) {
			System.out.println("Water is Freezing");
		}
		
		else if (celsius>=100) {
			System.out.println("Water is boiling at " + celsius + "*");
		}
		else{
			System.out.println("Water is at Normal state");

		}

	}

}
