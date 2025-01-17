package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x;
    private int y;
    private Job2dDriver driver;

    public void setDriver(Job2dDriver driver) {
        this.driver = driver;
    }
    public SetPositionCommand(Job2dDriver driver,int x,int y)
    {
        this.x=x;
        this.y=y;
        this.driver=driver;
    }

    @Override
    public void execute()
    {
        driver.setPosition(this.x,this.y);
    }
}
