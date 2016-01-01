package com.base.game.gameobject;

/**
 *
 * @author Stephen Rumpel
 */
public class CookieMonster extends Enemy
{

    public static final int SIZE = 32;

    public CookieMonster(float x, float y, int level)
    {
        super(level);
        init(x, y, 0.2f, 0.2f, 1.0f, SIZE, SIZE, 0);
        setAttackDelay(200);
    }
}
