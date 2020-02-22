package TableLamp.button;


public class Button {
	
	private BulbButtonInter bulb;
	
	public Button(BulbButtonInter bulb) {
		this.bulb = bulb;
	}
	
	public void switchOn() {
		System.out.print("Button switched to ON\n");
		bulb.switchOn();
	}
	
	public void switchOff() {
		System.out.print("Button switched to OFF\n");
		bulb.switchOff();
	}

}
