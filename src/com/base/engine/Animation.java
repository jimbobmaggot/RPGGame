package com.base.engine;

import java.util.ArrayList;

/**
 *
 * @author Stephen Rumpel
 */
public class Animation
{

    private ArrayList<Frame> frames;
    private int curFrame;

    public Animation()
    {
        frames = new ArrayList<Frame>();
    }
    
    public void render()
    {
        Frame temp = frames.get(curFrame);
        if (temp.render())
        {
            curFrame++;
            curFrame %= frames.size();
        }
    }
}
