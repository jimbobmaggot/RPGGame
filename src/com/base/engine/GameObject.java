package com.base.engine;

import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author Stephen Rumpel
 */
public abstract class GameObject
{

    protected float x;
    protected float y;
    protected int type;
    protected Sprite spr;

    protected boolean remove = false;

    public void update()
    {

    }

    public void render()
    {
        glPushMatrix();
        {
            glTranslatef(x, y, 0);
            spr.render();
        }
        glPopMatrix();
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

    /**
     * @return the width
     */
    public float getWidth()
    {
        return spr.getWidth();
    }

    /**
     * @return the height
     */
    public float getHeight()
    {
        return spr.getHeight();
    }

    public int getType()
    {
        return type;
    }

    public boolean getRemove()
    {
        return remove;
    }

    public void remove()
    {
        remove = true;
    }

    /**
     *
     * @param x
     * @param y
     * @param r
     * @param g
     * @param b
     * @param width
     * @param height
     * @param type
     */
    protected void init(
            float x, float y,
            float r, float g, float b,
            float width, float height, int type)
    {
        this.x = x;
        this.y = y;
        this.type = type;
        this.spr = new Sprite(r, g, b, width, height);
    }

}
