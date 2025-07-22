package week3day2;

public class JavaConnection implements DataBaseConnection {

	
	public void connect() {
		
		System.out.println("connected");
		
		
	}

	public void disconnect() {
		
		System.out.println("disconnected");
		
		
	}

	public void executeUpdate() {
		
		System.out.println("updated");
		
	}
	
	public static void main(String[] args) {
		
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		
		
	}

}
