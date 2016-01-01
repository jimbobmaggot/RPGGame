package com.base.game.gameobject;

/**
 *
 * @author Stephen Rumpel
 */
public class Stats
{

    public static final double LEVEL_CONST = 25 * (Math.pow(3, 3.0 / 2.0));

    private float xp;
    private final int level;
    private final boolean levelable;
    private int health;

    public Stats(float xp, boolean levelable)
    {
        this.levelable = levelable;

        if (levelable)
        {
            this.xp = xp;
            this.level = 1;
        } else
        {
            this.xp = -1;
            this.level = (int) xp;
        }
        this.health = getMaxHealth();
    }

    public float getSpeed()
    {
        return 4f;
    }

    public int getLevel()
    {
        if (!levelable)
        {
            return level;
        }

        double tempxp = xp + 105;
        double a = Math.sqrt(243 * (tempxp * tempxp) + 4050 * tempxp + 17500);
        double c = (3 * tempxp + 25) / 25;
        double d = Math.cbrt(a / LEVEL_CONST + c);

        return (int) (d - 1.0 / d * 3) - 1;
    }

    public int getMaxHealth()
    {
        return getLevel() * 10;
    }

    public int getCurrentHealth()
    {
        int max = getMaxHealth();
        if (health > max)
        {
            health = max;
        }
        return health;
    }

    public int getStrength()
    {
        return getLevel() * 4;
    }

    public int getMagic()
    {
        return getLevel() * 4;
    }

    public void addXp(float amt)
    {
        xp += amt;
    }
    
    public void damage(int amt){
        health -= amt;
    }
}
