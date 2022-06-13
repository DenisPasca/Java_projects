/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author rigsb
 */
public class Dictionary {
    
    private Map<String,String> dictionary;
    private ArrayList<String> words;
    
    public Dictionary() {
        this.dictionary = new HashMap<>();
        this.words=new ArrayList<>();
        
        add("test","test2");
        
        
    }
    
    public String get(String word) {
        return this.dictionary.get(word);
        
    }
    
    public void add(String word,String translation) {
        
        
        
         if (!this.dictionary.containsKey(word)) {
            this.words.add(word);
        }

        this.dictionary.put(word, translation);
    }
    
    public String getRandomWord() {
        Random rnd = new Random();
        
        return this.words.get(rnd.nextInt(this.words.size()));
    }
    
}
