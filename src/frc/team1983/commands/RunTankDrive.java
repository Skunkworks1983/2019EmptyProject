package frc.team1983.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team1983.OI;
import frc.team1983.subsystems.Drivebase;

public class RunTankDrive extends Command
{
    private Drivebase drivebase;
    private OI oi;

    public RunTankDrive(Drivebase drivebase, OI oi)
    {
        this.drivebase = drivebase;
        this.oi = oi;
    }

    @Override
    protected void initialize()
    {

    }

    @Override
    protected void execute()
    {
        drivebase.set(oi.getLeft(), oi.getRight());
    }

    @Override
    protected void interrupted()
    {
        end();
    }

    @Override
    protected void end()
    {
        drivebase.set(0.0, 0.0);
    }

    @Override
    protected boolean isFinished()
    {
        return false;
    }
}
