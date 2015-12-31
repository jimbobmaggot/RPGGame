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
    protected Sprite spr;

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
    
    protected void init(float x, float y, float r, float g, float b, float width, float height){
        this.x = x;
        this.y = y;
        this.spr = new Sprite(r, g, b, width, height);
    }

}
