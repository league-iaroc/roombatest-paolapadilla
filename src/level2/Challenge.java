package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(20000, 20000);
        sleep(1000);
        driveDirect(0,200);
        sleep(1000);
        driveDirect(1000,1000);
        sleep(1000);
        driveDirect(100,200);
        
	}

	public void loop() {

	}
}
