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
public class InputView {
    
    
    private Dictionary dictionary;
    
    public InputView(Dictionary dictionary) {
        this.dictionary=dictionary;
    }
    
    public Parent getView() {
        
        GridPane layout = new GridPane();
        
        Label text = new Label("Word");
        TextField textField = new TextField();
        Label translation = new Label("Translation");
        TextField translationField = new TextField();
        Button add = new Button("Add the word pair");
        
        layout.add(text, 0, 0);
        layout.add(textField, 0, 1);
        layout.add(translation, 0, 2);
        layout.add(translationField, 0, 3);
        layout.add(add, 0, 4);
        
        add.setOnMouseClicked((event) -> {
            
            String word = textField.getText();
            String trans = translationField.getText();
            dictionary.add(word, trans);
            
            textField.clear();
            translationField.clear();
        });
                
                
        
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        return layout;
        
    }
    
}
