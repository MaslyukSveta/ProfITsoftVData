package org.profitsoftvdata.task3.figura;

import org.profitsoftvdata.task3.Geometric3DShapes;

/**
 *
 */
public class Cylinder extends Geometric3DShapes {


    private int r;
    private int h;

    /**
     * @param r
     * @param h
     */
    public Cylinder(int r, int h) {
        this.h = h;
        this.r = r;
    }
    public int getR(){
        return r;
    }
    public int getH(){
        return h;

    }


    /**
     * @return
     */
    public int figureVolume(){
        return (int) (Math.PI * Math.pow(r, 2) * h);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "r=" + r +
                ", h=" + h +
                '}';
    }
}
