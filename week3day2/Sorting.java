package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
	
	public static void main(String[] args) {
		
		
		List<String> elements = new ArrayList<String>();
		
		elements.add("HCL");
		elements.add("Wipro");
		elements.add("Aspire");
		elements.add("Systems");
		elements.add("CTS");
		
		System.out.println(elements);
		
		Collections.sort(elements, Collections.reverseOrder());
		
		System.out.println("The sorted list is : " +elements);
		
		
		
		
		
	}

}
