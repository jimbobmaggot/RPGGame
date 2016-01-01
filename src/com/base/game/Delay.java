package com.base.game;

/**
 *
 * @author Stephen Rumpel
 */
public class Delay
{

    private final int length;
    private long endTime;
    boolean started;

    public Delay(int length)
    {
        this.length = length;
        started = false;
    }

    public boolean over()
    {
        if (!started)
        {
            return false;
        }
        /*
        if (Time.getTime() > endTime)
        {
            return true;
        }
        return false;
         */
        return Time.getTime() >= endTime;
    }

    public void start()
    {
        started = true;
        endTime = length * 1000000 + Time.getTime();
    }

    public void reset()
    {
        started = false;
    }

    public boolean active()
    {
        return started;
    }
    
    public void end(){
        started = true;
        endTime = 0;
    }
}
