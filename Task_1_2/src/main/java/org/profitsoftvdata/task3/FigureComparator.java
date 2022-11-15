package org.profitsoftvdata.task3;

import java.util.Comparator;

public class FigureComparator implements Comparator<Geometric3DShapes> {

    @Override
    public int compare(Geometric3DShapes f1, Geometric3DShapes f2) {


        while (f1 != null && f2 != null) {
            if (f1.figureVolume() < f2.figureVolume())
                return -1;
            else if (f1.figureVolume() == f2.figureVolume())
                return 0;
            else if (f1.figureVolume() > f2.figureVolume())
                return 1;
        }

        return 0;
    }



}
