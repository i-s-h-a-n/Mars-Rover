package com.bootcamp;

public class Rover {

    private int xmax, ymax, x, y;
    private char dirxn;

    public Rover(int xmax, int ymax, int x, int y, char dirxn) {

        this.xmax = xmax;
        this.ymax = ymax;
        this.x = x;
        this.y = y;
        this.dirxn = dirxn;
    }

    private String getPosition() {
        return Integer.toString(x) + " " + Integer.toString(y) + " " + dirxn;
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
        return getPosition();
    }

    public String turnLeft() {
        if(dirxn=='N')
            dirxn='W';
        else if(dirxn=='S')
            dirxn='E';
        else if(dirxn=='E')
            dirxn='N';
        else
            dirxn='S';
        return getPosition();
    }

    public String turnRight() {
        if(dirxn=='N')
            dirxn='E';
        else if(dirxn=='S')
            dirxn='W';
        else if(dirxn=='E')
            dirxn='S';
        else
            dirxn='N';
        return getPosition();
    }
}
