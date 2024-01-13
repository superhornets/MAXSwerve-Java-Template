package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.MAXSwerveModule;

public class DriveRotationsCommand extends CommandBase{
    private DriveSubsystem driveSubsystem;
    private double distance;

    public DriveRotationsCommand(DriveSubsystem driveSubsystem, double distance) {
        this.driveSubsystem = driveSubsystem;
        this.distance = distance;
        addRequirements(driveSubsystem);
    }

    @Override
    public void initialize() {
        driveSubsystem.resetEncoders();
        System.out.println("hello");
    }

    @Override
    public void execute() {
        System.out.println("Pos: FL: " + driveSubsystem.frontLeftPos() + " FR: " + driveSubsystem.frontRightPos() + " RL: " + driveSubsystem.rearLeftPos() + " RR: " + driveSubsystem.rearRightPos());
        System.out.println("Output: FL: " + driveSubsystem.frontLeftAppliedOutput() + " FR: " + driveSubsystem.frontRightAppliedOutput() + " RL: " + driveSubsystem.rearLeftAppliedOutput() + " RR: " + driveSubsystem.rearRightAppliedOutput());

        driveSubsystem.driveDistanceTest(distance);
    }
    @Override
    public void end(boolean interrupted) {
        
    }
    
}