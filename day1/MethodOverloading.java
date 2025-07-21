package week3.day1;

public class MethodOverloading {
	
	public void reportStep(String msg , String status) {
		
		System.out.println(msg +" "+status);
		
	}
	
	public void reportStep(String msg , String status,boolean snap) {
		
		System.out.println(msg+" " +status+" "+snap);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading method = new MethodOverloading();
		
		method.reportStep("Hello", "ok");
		method.reportStep("Hi", "progress", true);
	}
	

}
