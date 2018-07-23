package temperature;
import java.util.Arrays;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		
		int[] name= {2,45,85,0,3,5,9,74};
		
		System.out.println("befor sorting");
		for(int i=0;i<8;i++) {
			System.out.println(name[i]);
		}
		
		Arrays.sort(name);
		System.out.println("after sorting in Ascending order");
		for(int i=name.length-1;i>=0;i--) {
			System.out.println(name[i]);
			
		
		
			}
		
		
		
	}	

}
