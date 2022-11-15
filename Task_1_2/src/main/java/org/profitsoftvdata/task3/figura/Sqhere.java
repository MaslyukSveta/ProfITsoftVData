package org.profitsoftvdata.task3.figura;

import org.profitsoftvdata.Main;
import org.profitsoftvdata.task3.Geometric3DShapes;

public class Sqhere extends Geometric3DShapes {

    private int r;



    public Sqhere(int r) {
        this.r = r;

    }

    public int getR() {
        return r;
    }

    public void setR(){
        this.r = r;
    }


    /**
     * @return
     */
    @Override
    public int figureVolume(){
        return (int) ((4 *Math.PI * r * r * r)/3);
    }

    @Override
    public String toString() {
        return "Sqhere{" +
                "r=" + r +
                '}';
    }
}
