package lightbulb;

import switchable.Switchable;

public class Lightbulb implements Switchable {

	public void on() {
		System.out.println("Lightbulb on");		
	}
	
	public void off() {
		System.out.println("Lightbulb off");
	}
	
}
