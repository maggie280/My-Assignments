package week3.day1;

public class Edge extends Chrome{

	
	public void takeSnap() {
		
		System.out.println("snap");

	}
	
	public void clearCookies() {
		
		System.out.println("cookies clear");

	}
	
	public static void main(String[] args) {
		
		Edge e = new Edge();
		e.openURl();
		e.clearCookies();
	}
}
