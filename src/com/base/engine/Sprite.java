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

    private float width;
    private float height;

    public void Sprite(float r, float g, float b, float width, float height)
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
            glVertex2f(0, height);
            glVertex2f(width, height);
            glVertex2f(width, 0);
        }
        glEnd();
    }

}
