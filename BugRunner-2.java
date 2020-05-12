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
import info.gridworld.grid.Location;

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
        ActorWorld world = new ActorWorld();   // create a new gridworld where actors can roam
        
        Rock pebble = new Rock();    // create a new Rock object and store it in pebble
        world.add(pebble);                   //   add pebble to the world
        pebble.moveTo( new Location(2,2));   // move pebble to row 2, column 2 (upper left corner is 0,0)     
        
        Bug bizzy = new Bug();               // creat a new Bug object and store it in bizzy
        world.add(bizzy);                    //  add bizzy to the world
                                         
        //  move bizzy to row 4, colunn 4
        bizzy.moveTo( new Location(4,4));

        //vertRockLine(world, 6,6,5);      // add a vertical line of 5 rocks starting at 6,6 and going up
 
 
        // add another vertical line of 4 rocks starting at 6,2 and going up
        //vertRockLine(world, 6,2,4);
        //horizRockLine(world, 6,2,4);
        
        square(world, 6,2,4);
        
        world.show();
    }
    
    public static void vertRockLine(ActorWorld world, int row, int col, int numRocks)
    {
        if (numRocks > 0){
            Rock p = new Rock();
            world.add(p);
            p.moveTo( new Location(row,col));
            vertRockLine(world, row-1, col, numRocks - 1);
        }
    }
    
    public static void horizRockLine(ActorWorld world, int row, int col, int numRocks)
    {
        if (numRocks > 0)
        {
            Rock h = new Rock();
            world.add(h);
            h.moveTo( new Location(row,col));
            horizRockLine(world, row, col+1, numRocks - 1);
        }
    }
    
    public static void square(ActorWorld world, int row, int col, int numRocks)
    {
        vertRockLine(world, 6,2,4);
        vertRockLine(world, 6,6,5);
        horizRockLine(world, 6,2,4);
        horizRockLine(world, 2,2,4);
    }
}
