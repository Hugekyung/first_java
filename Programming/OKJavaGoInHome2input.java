//import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoInHome2input {

	public static void main(String[] args) {
		
//		String id = JOptionPane.showInputDialog("Enter a ID"); // 파이썬의 input과 같은 기능
//		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		
		String id = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + "/ Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + "/ floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" mood Lamp");
		moodLamp.setBright(Double.parseDouble(bright)); // double 타입으로 바꿔줘야 한다
		moodLamp.on();

	}

}
