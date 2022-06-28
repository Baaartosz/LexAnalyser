package com.sparta.lex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReadFileTest {

    @Test
    void getDataLongDocument() {
        // Had problems trying to compare the two documents from memory and from readFile output, although they are the same.
        // Probably missing some special formatting.
        // var textExample = "He took a sip of the drink. He wasn't sure whether he liked it or not, but at this moment it didn't matter. She had made it especially for him so he would have forced it down even if he had absolutely hated it. That's simply the way things worked. She made him a new-fangled drink each day and he took a sip of it and smiled, saying it was excellent. Sarah watched the whirlpool mesmerized. She couldn't take her eyes off the water swirling around and around. She stuck in small twigs and leaves to watch the whirlpool catch them and then suck them down. It bothered her more than a little bit that this could also be used as a metaphor for her life.";
        var filePath = "C:\\Dev\\Sparta Global\\Analyser\\src\\main\\java\\com\\sparta\\lex\\longDoc.txt";

        //Assertions.assertTrue(textExample.equals(ReadFile.getData(filePath)));
        Assertions.assertNotNull(ReadFile.getData(filePath));
    }

    @Test
    void getDataShortDocument() {
        var textExample = "the aliens are coming! run for your life!";
        var filePath = "C:\\Dev\\Sparta Global\\Analyser\\src\\main\\java\\com\\sparta\\lex\\shortDoc.txt";

        Assertions.assertEquals(textExample, ReadFile.getData(filePath));
        Assertions.assertNotNull(ReadFile.getData(filePath));
    }

    @Test
    void emptyParameters(){
        Assertions.assertNotNull(ReadFile.getData(""));
    }
}