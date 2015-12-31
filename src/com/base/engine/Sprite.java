package com.base.engine;

import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author Stephen Rumpel
 */
public class Sprite
{

    private float r;
    private float g;
    private float b;

    public float width;
    public float height;

    public Sprite(float r, float g, float b, float width, float height)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        this.width = width;
        this.height = height;

    }

    public void render()
    {
        glColor3f(r, g, b);
        glBegin(GL_QUADS);
        {
            glVertex2f(0, 0);
            glVertex2f(0, getHeight());
            glVertex2f(getWidth(), getHeight());
            glVertex2f(getWidth(), 0);
        }
        glEnd();
    }

    /**
     * @return the width
     */
    public float getWidth()
    {
        return width;
    }

    /**
     * @return the height
     */
    public float getHeight()
    {
        return height;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width)
    {
        this.width = width;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height)
    {
        this.height = height;
    }
    

}
