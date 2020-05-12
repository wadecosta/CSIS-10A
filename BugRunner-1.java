/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner
{
    public static void main(String[] args)
    {
        //ActorWorld world = new ActorWorld();
        ActorWorld world = new ActorWorld(new UnboundedGrid<Actor>());
        
        Bug rBug = new Bug();
        world.add(rBug);
        world.add(new Rock());
        world.show();
        
        
        rBug.moveTo(new Location(20,20));

        
        
        randomBug(rBug, 6);
        moveBug(rBug, 6);
        randomBug(rBug, 6);
        moveBug(rBug, 6);
    }
    public static void moveBug(Bug someBug, int n)
    {       
        if (n > 0)
        {
            if (someBug.canMove() )
            {
                someBug.move();
                moveBug(someBug, n-1);
            }
            else
            {
                someBug.turn();
                moveBug(someBug, n);
            }
        }
    }
    public static void randomBug(Bug someBug, int n)
    {
        if (n > 0) 
        {
        double rand = Math.random();
                
        if (rand < 0.25)
        {
            someBug.setDirection(0);
        } 
        else if (rand < 0.5)
        {
            someBug.setDirection(90);
        }
        else if (rand < 0.75)
        {
            someBug.setDirection(180);
        }
        else 
        {
            someBug.setDirection(270);
        }
        
        randomBug(someBug, n-1);
       }
    }
        
        
        
        
            
            
}
