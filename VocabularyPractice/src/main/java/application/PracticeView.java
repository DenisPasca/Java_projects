/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author rigsb
 */
public class PracticeView {
    
    private Dictionary dictionary;
    public String word;
    
    public PracticeView(Dictionary dictionary) {
        
        this.dictionary=dictionary;
        this.word=dictionary.getRandomWord();
    }
    
    public Parent getView() {
        
        GridPane layout = new GridPane();
        
        Label wordReceived = new Label("Translate this word: " + this.word);
        TextField translation = new TextField();
        Label feedback = new Label("");
        Button check = new Button("Check");
        
         layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        layout.add(wordReceived, 0 ,0);
        layout.add(translation, 0 ,1);
        layout.add(check, 0 ,2);
        layout.add(feedback, 0 ,3);
        
        check.setOnMouseClicked((event) -> {
            String trans = translation.getText();

            if(dictionary.get(word).equals(trans)) {
                feedback.setText("Correct");
            } else {
                feedback.setText("Wrong! The correct translation is " + this.dictionary.get(word));
                return;
            }
            
            this.word = this.dictionary.getRandomWord();
            wordReceived.setText("Translate the word '" + this.word + "'");
            translation.clear();
        });
        
        
        return layout;
    }
    
    
    
}
