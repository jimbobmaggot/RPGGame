package com.base.game.gameobject;

/**
 *
 * @author Stephen Rumpel
 */
public class Stats
{

    public static final double LEVEL_CONST = 25 * (Math.pow(3, 3.0 / 2.0));

    private float xp;
    private int health;

    public Stats(float xp)
    {
        this.xp = xp;
        this.health = getMaxHealth();
    }

    public float getSpeed()
    {
        return 4f;
    }

    public int getLevel()
    {
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
}
