package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		char[] charArray = test.toCharArray();
		
		for(int i =test.length()-1;i>=0;i--) {
			
			System.out.println(charArray[i]);
			
			
		}
		
		

	}

}
