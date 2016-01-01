package com.base.game.gameobject;

import com.base.engine.GameObject;

/**
 *
 * @author Stephen Rumpel
 */
public class StatObject extends GameObject
{

    protected Stats stats;

    public void damage(int amt)
    {
        stats.damage(amt);
    }
    
    public float getSpeed()
    {
        return stats.getSpeed();
    }

    public int getLevel()
    {
        return stats.getLevel();
    }

    public int getMaxHealth()
    {
        return stats.getMaxHealth();
    }

    public int getCurrentHealth()
    {
        return stats.getCurrentHealth();
    }

    public int getStrength()
    {
        return stats.getStrength();
    }

    public int getMagic()
    {
        return stats.getMagic();
    }

}
