package com.base.game.gameobject.item;

import com.base.engine.GameObject;
import com.base.engine.Sprite;

/**
 *
 * @author Stephen Rumpel
 */
public class Item extends GameObject
{

    protected String name;

    public void pickUp()
    {

    }

    protected void init(
            float x, float y,
            float r, float g, float b,
            float width, float height,
            String name)
    {
        this.x = x;
        this.y = y;
        this.type = 1;
        this.spr = new Sprite(r, g, b, width, height);
        this.name = name;
    }
}