package frc.robot;

public class RevConfigs {
    public static double CANCoderAngleToNeoEncoder(double CANCoderAngle){
        return CANCoderAngle / (2 * Math.PI) * Constants.Swerve.angleGearRatio * 42;
    }

    public static double NeoEncoderAngleToCANCoder(double NeoEncoderAngle){
        return NeoEncoderAngle * (2 * Math.PI) / Constants.Swerve.angleGearRatio / 42;
    }
}
