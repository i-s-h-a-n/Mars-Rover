package com.bootcamp;

public class Rover {

    private final int xmax, ymax, x, y;
    private final char dirxn;

    public Rover(int xmax, int ymax, int x, int y, char dirxn) {

        this.xmax = xmax;
        this.ymax = ymax;
        this.x = x;
        this.y = y;
        this.dirxn = dirxn;
    }

    public String move(String path) {
        if (x>xmax || y>ymax)
            return "Invalid Initial Position";
        return "";
    }
}
