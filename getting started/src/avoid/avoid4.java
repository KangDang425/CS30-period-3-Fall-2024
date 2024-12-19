package avoid;

import com.phidget22.DCMotor;
import com.phidget22.DistanceSensor;
import com.phidget22.Net;

public class avoid4 {
	public static void main(String[] args) throws Exception {

        //Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);

        while (true) {

            System.out.println("Distance: " + sonar.getDistance() + " mm");
            
            if (sonar.getDistance() < 400) {
                //Object detected! Stop motors
                leftMotors.setTargetVelocity(0.25);
                rightMotors.setTargetVelocity(0.25);
            } else {
                //Move forward slowly (25% max speed)
                leftMotors.setTargetVelocity(-0.50);
                rightMotors.setTargetVelocity(-0.50);
            }

            //Wait for 250milliseconds
            Thread.sleep(100);
        }
    }
}
