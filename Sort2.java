package temperature;
import java.util.Arrays;
import java.util.Collections;

public class Sort2 {

	public static void main(String[] args) {
		
		String[] name= {"jemeila","Aisha","Ahmed","Kpobi","Henemang","3","1","2","zebra"};
		
		System.out.println("Before Sort");
		for(int i=0;i<9;i++) {
			System.out.println(name[i]);
			
		}
		
		Arrays.sort(name);
		System.out.println("\nAfter Sort in Ascending Order");
		System.out.println(".............................\n");
		for(int i=0;i<9;i++) {
			System.out.println(name[i].toUpperCase());
		}
		
		Arrays.sort(name);
		System.out.println("\nAfter Sort in Descending Order");
		System.out.println(".................................\n");
		for(int i=name.length-1;i>=0;i--) {
			System.out.println(name[i].toUpperCase());
		}
		
		

	}

}
