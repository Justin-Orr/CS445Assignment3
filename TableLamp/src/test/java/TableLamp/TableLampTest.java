package TableLamp;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import TableLamp.lightbulb.Lightbulb;
import TableLamp.button.*;

class TableLampTest {
	
	private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); //Used for checking if print statements are correct
    private static final PrintStream originalOut = System.out; //Used to restore the output stream back to the original stdOut
	
	@BeforeAll
	static void outputSetup() {
		System.setOut(new PrintStream(outContent)); //Set the output stream to a custom print stream for checking output
	}

	@Test
	void testLightBulbOn() {
		Lightbulb lb = new Lightbulb();
		outContent.reset(); //Always clear the output for another test
		lb.on();
		boolean equal = false;
		if(outContent.toString().compareTo("Lightbulb on") == 0) {equal = true;}
		else {
			//System.err.println(outContent.toString().compareTo("Lightbulb on\n"));
			//System.err.println(outContent.toString());
			//System.err.println("Lightbulb on\n");
		}
		assertEquals(true, equal);
	}
	
	@Test
	void testLightBulbOff() {
		Lightbulb lb = new Lightbulb();
		outContent.reset(); //Always clear the output for another test
		lb.off();
		boolean equal = false;
		if(outContent.toString().compareTo("Lightbulb off") == 0) {equal = true;}
		assertEquals(true, equal);
	}
	
	@Test
	void testButtonOn() {
		Button b = new Button(new Lightbulb());
		outContent.reset(); //Always clear the output for another test
		b.switchOn();
		boolean equal = false;
		if(outContent.toString().compareTo("Button switched to ON\n" + "Lightbulb on") == 0) {equal = true;}
		assertEquals(true, equal);
	}
	
	@Test
	void testButtonOff() {
		Button b = new Button(new Lightbulb());
		outContent.reset(); //Always clear the output for another test
		b.switchOff();
		boolean equal = false;
		if(outContent.toString().compareTo("Button switched to OFF\n" + "Lightbulb off") == 0) {equal = true;}
		assertEquals(true, equal);
	}
	
	@Test
	void testPushdownButton() {
		PushdownButton b = new PushdownButton(new Lightbulb());
		outContent.reset(); //Always clear the output for another test
		b.pushButton();
		System.out.print("\n");
		b.pushButton();
		boolean equal = false;
		if(outContent.toString().compareTo("Button switched to ON\n" +
										   "Lightbulb on\n" + 
										   "Button switched to OFF\n" + 
										   "Lightbulb off") == 0) {equal = true;}
		assertEquals(true, equal);
	}
	
	@AfterAll
    static void restoreStreams() {
        System.setOut(originalOut);
    }

}
