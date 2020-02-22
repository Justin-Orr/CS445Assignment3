package TableLamp;

import TableLamp.button.*;
import TableLamp.lightbulb.Lightbulb;

public class TableLamp {

	public static void main(String[] args) {
		PushdownButton button = new PushdownButton(new Lightbulb());
		button.pushButton();
		System.out.print("\n");
		button.pushButton();
		System.out.print("\n");
	}

}
