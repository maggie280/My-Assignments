package week2.day1;

public class Browser {
	
	public String launchBrowser() {
		
		String name = "google";
		
		return name;

	}
	
	public String loadUrl() {
		
		String url = ("https://www.google.com");
		
		return url;
	}
	
	public static void main(String[] args) {
		
		Browser browse = new Browser();
		String name = browse.launchBrowser();
		String url = browse.loadUrl();
		System.out.println("Browser launched successfully :  " + name);
		System.out.println("Application url loaded successfully :  " + url);
	}

}
