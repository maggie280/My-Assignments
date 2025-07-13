package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num = 20;
		
		int first =0,second = 1;
		
		
		System.out.println("Fibonacci series :" + num);
		
		
		for(int i=0;i<num;i++) {
			
			System.out.println(first + "");
			
				
		int	next = first+second;
		
		    first = second;
			second = next;
			
			
			
		}

	}

}
