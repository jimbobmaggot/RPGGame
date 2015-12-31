package com.base.game.gameobject;

import com.base.engine.GameObject;
import com.base.game.gameobject.item.Item;
import org.lwjgl.input.Keyboard;

/**
 *
 * @author Stephen Rumpel
 */
public class Player extends GameObject
{

    public static final int SIZE = 32;
    public static final double LEVEL_CONST = 25 * (Math.pow(3, 3.0 / 2.0));

    private int health;
    private float xp;

    public Player(float x, float y)
    {
        init(x, y, 0.1f, 1f, 0.25f, SIZE, SIZE, 0);
        health = 10;
        xp = 0;
    }

    @Override
    public void update()
    {
        /*
        System.out.println("Stats: SPEED: " + getSpeed()
                + " LEVEL: " + getLevel()
                + " MAXHP: " + getMaxHealth()
                + " HP: " + getCurrentHealth()
                + " STRENGTH: " + getStrength()
                + " MAGIC: " + getMagic());
         */
    }

    public void getInput()
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_W))
        {
            move(0, 1);
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_S))
        {
            move(0, -1);
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_A))
        {
            move(-1, 0);
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_D))
        {
            move(1, 0);
        }
    }

    private void move(float magX, float magY)
    {
        x += getSpeed() * magX;
        y += getSpeed() * magY;
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

    public void addItem(Item item)
    {
        System.out.println("We just picked up an item!");
    }
}
