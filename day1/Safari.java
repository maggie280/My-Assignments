package week3.day1;

public class Safari extends Chrome {
	
	public void readerMode() {
		
		System.out.println("read mode");

	}

	public void fullScreenMode() {
		System.out.println("fullscreen");

	}
	
	public static void main(String[] args) { 
	
		Safari s = new Safari();
		s.navigateBack();
	    s.fullScreenMode();
	    s.clearCache();
	}

}
