package com.sparta.lex;

public class Main {
    public static void main(String[] args) {

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