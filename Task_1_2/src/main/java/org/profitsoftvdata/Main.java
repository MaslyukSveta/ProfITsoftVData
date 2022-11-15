package org.profitsoftvdata;

import org.profitsoftvdata.task3.*;
import org.profitsoftvdata.task3.figura.Cube;
import org.profitsoftvdata.task3.figura.Cylinder;
import org.profitsoftvdata.task3.figura.Sqhere;

import java.util.*;

import static org.profitsoftvdata.task1.Numbers.positiveIntegerSort1;
import static org.profitsoftvdata.task2.HashTags.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        int [] arr = { 5, 2, 1, -8,0, 10 };
        System.out.println(Arrays.toString(positiveIntegerSort1(arr)));

        Shapes3D shapes3D = new Shapes3D();

        shapes3D.add(new Cube(15));
        shapes3D.add(new Cylinder(12, 18));
        shapes3D.add(new Cube(5));
        shapes3D.add(new Cylinder(2, 8));
        shapes3D.add(new Cube(4));
        shapes3D.add(new Cylinder(1, 8));
        shapes3D.add(new Cube(6));
        shapes3D.add(new Cylinder(7, 5));
        shapes3D.add(new Sqhere(3));
        shapes3D.add(new Sqhere(3));
        shapes3D.add(new Sqhere(3));
        shapes3D.add(new Sqhere(3));




        shapes3D.sortSquarePrint(shapes3D1);
        shapes3D.sortSquarePrint1();

        List<String> list = Arrays.asList(
                "#Франция#d", "#Германия#d#d#d", "#Монако", "#Испания", "#Италия",
                "#Австрия", "#Испания", "#Монако#68", "#Грузия#68", "#Монако",
                "#Испания", "#Италия", "#Монако", "#Сингапур", "#Армения");


       top5Hashtags3(top5Hashtags2(top5Hashtags1(list)));
       top5Hashtags4(list);



    }
}