package TableLamp.button;


public class PushdownButton {
	
	private BulbButtonInter bulb;
	private int buttonState; // 0 = off, 1 = on
	
	public PushdownButton(BulbButtonInter bulb) {
		this.bulb = bulb;
		buttonState = 0;
	}
	
	public void pushButton() {
		if(buttonState == 0) {
			System.out.print("Button switched to ON\n");
			bulb.switchOn();
			buttonState = 1;
		} 
		else {
			System.out.print("Button switched to OFF\n");
			bulb.switchOff();
			buttonState = 0;
		}
		
	}

}