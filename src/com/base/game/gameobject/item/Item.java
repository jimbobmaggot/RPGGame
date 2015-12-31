package com.base.game.gameobject.item;

import com.base.engine.GameObject;
import com.base.engine.Physics;
import com.base.engine.Sprite;
import com.base.game.gameobject.Player;

/**
 *
 * @author Stephen Rumpel
 */
public class Item extends GameObject
{

    protected String name;
    protected Player player;

    public Item(Player play)
    {
        this.player = play;
    }

    public void pickUp()
    {
        System.out.println("You just picked up " + name + "!");
        player.addItem(this);
        remove();
    }

    @Override
    public void update()
    {
        if (Physics.checkCollisions(this, player) != null)
        {
            pickUp();
        }
    }

    public String getName()
    {
        return name;
    }

    protected void init(
            float x, float y,
            float r, float g, float b,
            float width, float height,
            String name)
    {
        this.x = x;
        this.y = y;
        this.type = ITEM_ID;
        this.spr = new Sprite(r, g, b, width, height);
        this.name = name;
    }
}
