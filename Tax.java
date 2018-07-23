package temperature;
import java.util.Scanner;

public class Tax{
	public static void main(String[] args) {
		
		System.out.println("Enter an amount");
		
		Scanner scan= new Scanner(System.in);
		double amount = scan.nextDouble();
		double fTax=amount*0.3;
		double sTax=amount*0.06;
		
		System.out.println("Your Federal Tax is $"+fTax);
		System.out.println("Your State Tax is $"+sTax);
	}
}

	
