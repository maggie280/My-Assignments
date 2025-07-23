package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Convertion {

	public static void main(String[] args) {
		
		String Companyname = "google";
		
		char[] c = Companyname.toCharArray();
		
		System.out.println(Companyname);
		
		Set<Character> name = new LinkedHashSet<Character>();
		
		for (int i = 0; i < c.length; i++) {
			
			name.add(c[i]);
			
		}
		
		System.out.println(name);
		
		
	}
	
}
