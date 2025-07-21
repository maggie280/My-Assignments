package week3.day1;

public class Chrome extends Browser{
	
	public void openIncognito() {
		
		System.out.println("Tab opened");

	}
	
	public void clearCache() {
		
		System.out.println("cache cleared");
	}

	
	public static void main(String[] args) {
		
		Chrome browse = new Chrome();
		
		browse.openURl();
		browse.closeBrowser();
		browse.openIncognito();
		browse.clearCache();
			
		
	}
}
