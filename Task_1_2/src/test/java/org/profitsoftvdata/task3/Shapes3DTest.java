package org.profitsoftvdata.task3;

import org.junit.jupiter.api.Test;
import org.profitsoftvdata.task3.figura.Cube;
import org.profitsoftvdata.task3.figura.Cylinder;
import org.profitsoftvdata.task3.figura.Sqhere;

import static org.junit.jupiter.api.Assertions.*;

class Shapes3DTest {

    Shapes3D shapes3D1 = new Shapes3D();

       
    @Test
    void sortSquare() {


        shapes3D1.add(new Cube(15));
        shapes3D1.add(new Cylinder(12, 18));
        shapes3D1.add(new Cube(5));
        shapes3D1.add(new Cylinder(2, 8));
        shapes3D1.add(new Cube(4));
        shapes3D1.add(new Cylinder(1, 8));
        shapes3D1.add(new Cube(6));
        shapes3D1.add(new Cylinder(7, 5));
        shapes3D1.add(new Sqhere(3));
        shapes3D1.add(new Sqhere(3));
        shapes3D1.add(new Sqhere(3));
        shapes3D1.add(new Sqhere(3));
       

        equals("Cylinder{r=1, h=8} 25\n" +
                "Cube{a=4} 64\n" +
                "Cylinder{r=2, h=8} 100\n" +
                "Sqhere{r=3} 113\n" +
                "Sqhere{r=3} 113\n" +
                "Sqhere{r=3} 113\n" +
                "Sqhere{r=3} 113\n" +
                "Cube{a=5} 125\n" +
                "Cube{a=6} 216\n" +
                "Cylinder{r=7, h=5} 769\n" +
                "Cube{a=15} 3375\n" +
                "Cylinder{r=12, h=18} 8143\n","Cylinder{r=1, h=8} 25\n" +
                "Cube{a=4} 64\n" +
                "Cylinder{r=2, h=8} 100\n" +
                "Sqhere{r=3} 113\n" +
                "Sqhere{r=3} 113\n" +
                "Sqhere{r=3} 113\n" +
                "Sqhere{r=3} 113\n" +
                "Cube{a=5} 125\n" +
                "Cube{a=6} 216\n" +
                "Cylinder{r=7, h=5} 769\n" +
                "Cube{a=15} 3375\n" +
                "Cylinder{r=12, h=18} 8143\n")
    }

    private void equals(String s, String s1) {
    }


}