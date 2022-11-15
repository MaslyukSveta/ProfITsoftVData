package org.profitsoftvdata.task3;

import java.util.Arrays;

public class Shapes3D {


    Geometric3DShapes[] list = new Geometric3DShapes[100];
    int p = 0;

    public void add(Geometric3DShapes f) {
        list[p++] = f;
    }

    public void sortSquare() {
        Arrays.sort(list, new FigureComparator());

    }

    public void sortSquarePrint() {
        Arrays.sort(list, new FigureComparator());

        for (Geometric3DShapes t : list) {
            if (t != null) {
                System.out.println(t.figureVolume());
            }
        }
    }
}
