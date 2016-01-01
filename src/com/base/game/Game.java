package com.base.game;

import com.base.engine.GameObject;
import com.base.game.gameobject.CookieMonster;
import com.base.game.gameobject.Player;
import com.base.game.gameobject.item.Cube;
import java.util.ArrayList;
import org.lwjgl.opengl.Display;

/**
 *
 * @author Stephen Rumpel
 */
public class Game
{

    private final ArrayList<GameObject> objects;
    private final ArrayList<GameObject> remove;
    private final Player player;

    public Game()
    {
        objects = new ArrayList<>();
        remove = new ArrayList<>();

        player = new Player(Display.getWidth() / 2 - Player.SIZE / 2,
                Display.getHeight() / 2 - Player.SIZE / 2);
        objects.add(player);
        objects.add(new Cube(32, 32, player));
        objects.add(new CookieMonster(300, 500, 1));
    }

    public void getInput()
    {
        player.getInput();
    }

    public void update()
    {
        objects.stream().forEach((go)
                -> 
                {
                    if (!go.getRemove())
                    {
                        go.update();
                    } else
                    {
                        remove.add(go);
                    }
        });

        remove.stream().forEach((go)
                -> 
                {
                    objects.remove(go);
        });

    }

    public void render()
    {
        objects.stream().forEach((go)
                -> 
                {
                    go.render();
        });
    }

    public ArrayList<GameObject> sphereCollide(float x, float y, float radius)
    {
        ArrayList<GameObject> res = new ArrayList<>();

        //for GameObject go : objects
        objects.stream().filter((go)
                //If
                -> (Util.dist(go.getX(), go.getY(), x, y) < radius)).forEach((go)
                -> 
                {
                    //Then
                    res.add(go);
        });

        return res;
    }
}
