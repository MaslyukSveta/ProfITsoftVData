package org.profitsoftvdata.task2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 */
public class HashTags {

    /**
     * A method that accepts as input a list of text strings that may contain hashtags
     * (words beginning with the "#" sign).
     * As a result, the method should return the top-5 most frequently mentioned hashtags
     * with the number of mentions of each of them.
     * Multiple identical hashtags on the same line should count as one mention.
     * @param list
     * @return
     */

    public static void top5Hashtags(List<String> list) {
        Map<String, Long> frequency =
                list.stream().collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));


    }
    public static String top5Hashtags1(List<String> list) {


        return list.stream().collect(Collectors.joining(""));
    }


    public static Map<String, Long> top5Hashtags2(String string) {

        List<String> list;

        list = List.of(string.split("#"));
        Map<String, Long> frequency =
                list.stream().collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));




      //  frequency.forEach((k, v) -> System.out.println(k + ": " + v));

        return frequency;
    }



    public static void  top5Hashtags3(Map<String, Long> longMap) {

         longMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(5)
                .forEach(System.out::println);
    }



}
