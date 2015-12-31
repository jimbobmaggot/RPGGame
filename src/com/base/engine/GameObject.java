package com.base.engine;

/**
 *
 * @author Stephen Rumpel
 */
public abstract class GameObject
{

    public float x;
    public float y;
    private Animation anim;

    public void update()
    {

    }

    public void render()
    {

    }

    /**
     * @return the x
     */
    public float getX()
    {
        return x;
    }

    /**
     * @return the y
     */
    public float getY()
    {
        return y;
    }

}
