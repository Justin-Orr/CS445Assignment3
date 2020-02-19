package button;

import switchable.Switchable;

public class Button implements Switchable{
	
	public void on() {
		System.out.println("Button switched to ON");		
	}
	
	public void off() {
		System.out.println("Button switched to OFF");
	}

}
