package com.sparta.lex;

/*
    https://github.com/Baaartosz/LexAnalyser
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LexAnalyser lexAnalyser = new LexAnalyser(ReadFile.getData("C:\\Dev\\Sparta Global\\Analyser\\src\\main\\java\\com\\sparta\\lex\\shortDoc.txt"));
        System.out.println(lexAnalyser.mostCommonChar("The aliens are coming"));
        mostCommon("HELLO HOW GOES IT");
    }

    public static void mostCommon(String input) {
        List<String> words = new ArrayList<>(Arrays.asList(input.split(" ")));
        Map<Character, Long> charFrequency = words
                .stream()
                .flatMap(a -> a.chars().mapToObj(c -> (char) c))
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
        System.out.println(charFrequency);
    }
}