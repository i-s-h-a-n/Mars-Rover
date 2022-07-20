package com.bootcamp;

public class Rover {

    private int xmax, ymax, x, y;
    private final char dirxn;

    public Rover(int xmax, int ymax, int x, int y, char dirxn) {

        this.xmax = xmax;
        this.ymax = ymax;
        this.x = x;
        this.y = y;
        this.dirxn = dirxn;
    }

    public String move() {
        if (x>xmax || y>ymax)
            return "Invalid Initial Position";
        if(dirxn=='N')
           y++;
        if(dirxn=='S')
            y--;
        if(dirxn=='E')
            x++;
        if(dirxn=='W')
            x--;
        if(x>xmax || x<0 || y>ymax || y<0)
            return "Invalid Move";
        return Integer.toString(x)+" "+Integer.toString(y)+" "+dirxn;
    }

//    public String turnLeft() {
//
//    }
}
