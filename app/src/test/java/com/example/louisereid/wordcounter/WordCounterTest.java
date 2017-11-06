package com.example.louisereid.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 06/11/2017.
 */

public class WordCounterTest {

    WordCounter wordCounter;
    ArrayList<String> words;

    @Before
    public void before(){
        wordCounter = new WordCounter();
        words = new ArrayList<>();
    }

    @Test
    public void canAddToWords(){
        wordCounter.addOneWord("Hello");
        assertEquals("word count: 1", wordCounter.wordsSize());
    }

    @Test
    public void canAddSentence(){
        wordCounter.addSentence("Hello world hiya");
        assertEquals("word count: 3", wordCounter.wordsSize());
    }

    @Test
    public void canCountWords(){
        assertEquals("word count: world=1, Hello=1, hiya=1", wordCounter.numWords("Hello world hiya"));
    }
}
