package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		
		List<Integer> num = new ArrayList<Integer>();
		
		num.add(3);
		num.add(2);
		num.add(11);
		num.add(4);
		num.add(6);
		num.add(7);
		
		Integer IndexValue1 = num.get(5);
		Collections.sort(num);
		System.out.println("The sorted list value is : "+num);
		System.out.println("The second value is  : " +IndexValue1);
	}

}
