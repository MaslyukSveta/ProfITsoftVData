package org.profitsoftvdata.task3.figura;

import org.profitsoftvdata.task3.Geometric3DShapes;

public class Cube extends Geometric3DShapes {

    private int a;

    public Cube(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
    public void setA() {
        this.a = a;
    }


    @Override
    public int figureVolume(){
        return (int) Math.pow(a, 3);
    }


    @Override
    public String toString() {
        return "Cube{" +
                "a=" + a +
                '}';
    }
}
