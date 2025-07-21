package Polymorphism;


public class Override extends Snap{

	public void takeSnap() {
		
		super.takeSnap();
		
		System.out.println("snap took");

	}
	
	public static void main(String[] args) {
		
		Override ride = new Override();
		ride.takeSnap();
				
	}
}
