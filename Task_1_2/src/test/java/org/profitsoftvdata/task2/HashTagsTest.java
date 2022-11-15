package org.profitsoftvdata.task2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class HashTagsTest {



    @Test
    public void top5Hashtags3() {
        List<String> list = Arrays.asList(
                "#Франция#d", "#Германия#d#d#d", "#Монако", "#Испания", "#Италия",
                "#Австрия", "#Испания", "#Монако#68", "#Грузия#68", "#Монако",
                "#Испания", "#Италия", "#Монако", "#Сингапур", "#Армения");


        HashTags hashTags = new HashTags();

        String result = hashTags.top5Hashtags4(list);

        assertEquals("d=4\n" +
                "Монако=4\n" +
                "Испания=3\n" +
                "68=2\n" +
                "Италия=2", result);



    }
}