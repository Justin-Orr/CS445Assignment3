package TableLamp.lightbulb;

import TableLamp.button.BulbButtonInter;

public class Lightbulb implements BulbButtonInter {

	public void on() {
		System.out.print("Lightbulb on");		
	}
	
	public void off() {
		System.out.print("Lightbulb off");
	}
	
	public void switchOn() {
		on();
	}
	
	public void switchOff() {
		off();
	}
	
}
