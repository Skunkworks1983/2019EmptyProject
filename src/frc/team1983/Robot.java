package frc.team1983;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team1983.commands.RunTankDrive;
import frc.team1983.subsystems.Drivebase;

public class Robot extends TimedRobot
{
    private Drivebase drivebase;
    private OI oi;

    @Override
    public void robotInit()
    {
        drivebase = new Drivebase();
        oi = new OI();
    }

    @Override
    public void robotPeriodic()
    {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit()
    {

    }

    @Override
    public void autonomousPeriodic()
    {

    }

    @Override
    public void teleopInit()
    {
        Scheduler.getInstance().removeAll();
        Scheduler.getInstance().add(new RunTankDrive(drivebase, oi));
    }

    @Override
    public void teleopPeriodic()
    {

    }

    @Override
    public void testPeriodic()
    {

    }

    public Drivebase getDrivebase()
    {
        return drivebase;
    }

    public OI getOi()
    {
        return oi;
    }
}
