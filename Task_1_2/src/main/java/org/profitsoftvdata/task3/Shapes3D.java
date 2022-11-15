package org.profitsoftvdata.task3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 */
public class Shapes3D {

    ArrayList<Geometric3DShapes> list = new ArrayList<>();


    /**
     * @param f
     */
    public void add(Geometric3DShapes f) {
        list.add(f);
    }

    /**
     *
     */
    public void sortSquare() {
        Collections.sort(list, new FigureComparator());

    }

    /**
     *
     */
    public void sortSquarePrint(Shapes3D shapes3D1) {
        Collections.sort(list, new FigureComparator());

        for (Geometric3DShapes t : list) {
            if (t != null) {
                System.out.println(t.figureVolume());
            }
        }
    }
    public void sortSquarePrint1() {
        Collections.sort(list, new FigureComparator());

        for (Geometric3DShapes t : list) {
            if (t != null) {
                System.out.println(t.toString() + " " + t.figureVolume());
            }
        }
    }
}
