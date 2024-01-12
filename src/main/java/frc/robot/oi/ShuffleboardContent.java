package frc.robot.oi;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import java.util.Map;

import java.util.HashMap;

public class ShuffleboardContent {

    public static void initMotorShuffleboard(CANSparkMax motor) {

        HashMap<Integer, String> motorName = new HashMap<Integer, String>();
        motorName.put(10, "motor 1");
        motorName.put(5, "motor 2");
        motorName.put(54, "motor 3");
        motorName.put(57, "motor 4");

        HashMap<Integer, Integer> motorIndex = new HashMap<Integer, Integer>();
        motorIndex.put(10, 0);
        motorIndex.put(5, 1);
        motorIndex.put(54, 2);
        motorIndex.put(57, 3);

        ShuffleboardLayout motorLayout = Shuffleboard.getTab("Test Motors")
                .getLayout("Motor 1", BuiltInLayouts.kList).withPosition(0, 0)
                .withSize(2, 3).withProperties(Map.of("Label Position", "LEFT"));

        motorLayout.addNumber("Position", () -> motor.getEncoder().getPosition());
        motorLayout.addNumber("Velocity", () -> motor.getEncoder().getVelocity());



    }
    
}
