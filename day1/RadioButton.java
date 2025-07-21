package week3.day1;

public class RadioButton extends Button{

	
	public void selectRadioButton() {
		
		System.out.println("radio played");

	}
	
	public static void main(String[] args) {
		
		RadioButton radio = new RadioButton();
		radio.submit();
		radio.selectRadioButton();
		
	}
	
}
