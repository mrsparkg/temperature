package temperature;
import java.util.HashMap;
import java.util.Set;

public class Hashmap2 {

	public static void main(String[] args) {
		
		HashMap<String,String> phonebook=new HashMap<>();
		
			phonebook.put("Ahmed","13478497172");
			phonebook.put("Kpobi","233244580879");
			phonebook.put("Jemila","0244580579");
			phonebook.put("Reuben","18592020765");
			phonebook.put("Aisha","0204450795");
			phonebook.put("Petter", "0595362647");
			
			Set<String> keys =phonebook.keySet();
			
			for(String i:keys) {
				System.out.println(i+" :" + phonebook.get(i));
				
			}

	}

}
