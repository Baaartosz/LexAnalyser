package com.sparta.lex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LexAnalyserTest {

    String longFile = "C:\\Dev\\Sparta Global\\Analyser\\src\\main\\java\\com\\sparta\\lex\\longDoc.txt";
    String shortFile = "C:\\Dev\\Sparta Global\\Analyser\\src\\main\\java\\com\\sparta\\lex\\shortDoc.txt";

    LexAnalyser lexAnalyser;
    @BeforeEach
    void setUp() {
        lexAnalyser = new LexAnalyser(shortFile);
    }

    @Test
    @DisplayName("Num of this type of character")
    void charNumtest(){
        Assertions.assertEquals(2, lexAnalyser.numOfThisLetter("book", 'o'));

    }

    @Test
    void mostCommonChar() {
        Assertions.assertEquals('a', lexAnalyser.mostCommonChar("aaaaaab00000000000000000000000"));
        Assertions.assertEquals(0, lexAnalyser.mostCommonChar("0930193012  3 3123"));
    }

    @Test
    void getTextData() {
//        Assertions.assertEquals("");
    }
}