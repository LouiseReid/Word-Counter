package com.example.louisereid.wordcounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by louisereid on 06/11/2017.
 */

public class WordCounter {

    private ArrayList<String> words;

    public WordCounter(){
        words = new ArrayList<>();
    }



    public void addOneWord(String word){
        words.add(word);
    }

    public String  wordsSize(){
        return "word count: " + words.size();
    }

    public void addSentence(String sentence){
        clear();
        String[] arr = sentence.split(" ");
        for(String words : arr){
            this.words.add(words);
        }
    }

    public void clear(){
        this.words.clear();
    }

    public String numWords(String sentence){
        String[] words = sentence.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Integer count = map.get(word);
            if(count == null){
                count = 0;
            }
            map.put(word, count + 1);
        }
        return "word count: " + map.toString().replace("{","").replace("}","").trim();
    }




}
