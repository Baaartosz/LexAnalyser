package com.sparta.lex;

import java.util.HashMap;
import java.util.Map;

public class LexAnalyser {

    /*
    DONE get data from file

    TODO number of chars INC tests
    TODO number of words INC tests
    TODO number of occurrences of a letter INC tests
    TODO most frequently found letters INC tests

    DONE allow parameter input for file
    TODO console reporting of details.

    MUST case insensitive and non-alpha ignored

    TODO Markdown File!!!!!
     */

    private String textData;

    public LexAnalyser(String filePath){
        textData = ReadFile.getData(filePath);
    }


    public int numOfChars(String input){
        StringBuilder str = new StringBuilder();
        str.append(input);

        int result = input.length();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                result--;
            }
        }
        return result;
    }

    public int numOfWords(String input){
        String[] s = input.split(" ");
        StringBuilder str = new StringBuilder();
        str.append(input);
        int result = 1;

        for(String word: s){
            result++;
        }

        return result;
    }
    public int numOfThisLetter(String input, char c){
        StringBuilder str = new StringBuilder();
        str.append(input.toLowerCase());
        int result = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                result++;
            }
        }

        return result;
    }

    public char mostCommonChar(String input){
        HashMap<Character, Integer> charCounts = new HashMap<>();
        char[] charArray = input.toCharArray();

        // Count all chars in input string.
        for (char c : charArray) {
            if (!Character.isLetter(c)) break;
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }

        // Find the highest frequency character.
        int highestFreq = 0;
        char mostFreqChar = 0;
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if(entry.getValue() > highestFreq){
                highestFreq = entry.getValue();
                mostFreqChar = entry.getKey();
            }
        }
        return mostFreqChar;
    }

    public String getTextData() {
        return textData;
    }
}
