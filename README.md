### Lexical Analyser

Worked on by Toby Gascogine, Bartosz Perczynski and Abdur-Rahmaan Azam.

## ReadFile Class

Providing a filePath it will read the file and return a string of its contents.

Will catch ``FileNotFoundException`` and return a empty string.

```java
ReadFile.getData(String filepath);
```

## LexAnalyser

Functions below will convert to lowercase to avoid issues with capitalisation.

```java
LexAnalyser(String filePath); // Reads from file and processed data can be accessed using getTextData();

// Functions include
numOfWords(String input); 
numOfThisLetter(String input);
mostCommonChar(String input);
getTextData(); 
```
