package temperature;
import java.util.Scanner;


public class Methodoverloading {

	public static void main(String[] args) {
		System.out.println(Add(100.3,90));
		System.out.println(Add(3,90));
		System.out.println(Add("Ahmed ","Kpobi"));
	}
	
	public static int Add(int a, int b) {
		return(a+b);
	}
	
	public static double Add( double a, double b) {
		return(a-b);
	}
	public static String Add( String a, String b) {
		return(a+b);
	}
		
}

	
