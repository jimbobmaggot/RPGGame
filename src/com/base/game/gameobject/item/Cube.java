package com.base.game.gameobject.item;

import com.base.engine.Physics;
import com.base.game.gameobject.Player;

/**
 *
 * @author Stephen Rumpel
 */
public class Cube extends Item
{

    public static final float SIZE = 32;

    private final Player player;

    public Cube(float x, float y, Player play)
    {
        init(x, y, 1.0f, 0.5f, 0, SIZE, SIZE, "The Cube");
        this.player = play;
    }

    @Override
    public void pickUp()
    {
        System.out.println("You just picked up " + name + "!");
        player.addItem(this);
        remove();
    }

    @Override
    public void update()
    {
        if (Physics.checkCollisions(this, player))
        {
            pickUp();
        }
    }
}
