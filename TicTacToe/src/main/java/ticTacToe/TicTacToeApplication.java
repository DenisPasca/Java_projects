package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {
    boolean gameState=false;
int contor = 0;
Button button1 = new Button("");
Label info = new Label("Turn: X");
        Button button2 = new Button("");
        Button button3 = new Button("");
        Button button4 = new Button("");
        Button button5 = new Button("");
        Button button6 = new Button("");
        Button button7 = new Button("");
        Button button8 = new Button("");
        Button button9 = new Button("");
    @Override
    public void start(Stage stage) throws Exception {

        
        BorderPane layout = new BorderPane();

        

        layout.setTop(info);
        layout.setPrefSize(300, 180);
        layout.setPadding(new Insets(10, 10, 10, 10));

        

        GridPane game = new GridPane();

        game.add(button1, 0, 0);
        game.add(button2, 0, 1);
        game.add(button3, 0, 2);
        game.add(button4, 1, 0);
        game.add(button5, 1, 1);
        game.add(button6, 1, 2);
        game.add(button7, 2, 0);
        game.add(button8, 2, 1);
        game.add(button9, 2, 2);

        game.setVgap(10);
        game.setHgap(10);
        game.setPadding(new Insets(10, 10, 10, 10));

        layout.setCenter(game);
    
        

        Scene scena = new Scene(layout);

        stage.setScene(scena);

        stage.show();
        
       
     
 
        
        button1.setOnMouseClicked((event) -> {

            if (button1.getText().isEmpty()) {

                if (contor % 2 == 0) {
                    button1.setText("X");
                    info.setText("Turn: O");
                    

                } else {
                    button1.setText("O");
                    info.setText("Turn: X");
                   

                }
                contor++;
                checkGame();
                
                if(isGameDone(gameState)) {
                    info.setText("The end!");
                }
            }

        });

        button2.setOnMouseClicked((event) -> {

            if (button2.getText().isEmpty()) {

                if (contor % 2 == 0) {
                    button2.setText("X");
                    info.setText("Turn: O");

                } else {
                    button2.setText("O");
                    info.setText("Turn: X");

                }
                contor++;
                checkGame();
                
                if(isGameDone(gameState)) {
                    info.setText("The end!");
                }
            }

        });

        button3.setOnMouseClicked((event) -> {

            if (button3.getText().isEmpty()) {

                if (contor % 2 == 0) {
                    button3.setText("X");
                    info.setText("Turn: O");

                } else {
                    button3.setText("O");
                    info.setText("Turn: X");

                }
               contor++;
               checkGame();
               if(isGameDone(gameState)) {
                    info.setText("The end!");
                }
               
            }
            

        });

        button4.setOnMouseClicked((event)
                -> {

            if (button4.getText().isEmpty()) {

                if (contor % 2 == 0) {
                    button4.setText("X");
                    info.setText("Turn: O");

                } else {
                    button4.setText("O");
                    info.setText("Turn: X");
                }
               contor++;
               checkGame();
            }

        });

        button5.setOnMouseClicked((event) -> {

            if (button5.getText().isEmpty()) {

                if (contor % 2 == 0) {
                    button5.setText("X");
                    info.setText("Turn: O");

                } else {
                    button5.setText("O");
                    info.setText("Turn: X");
                }
               contor++;
               checkGame();
              
            }

        });

        button6.setOnMouseClicked((event) -> {

            if (button6.getText().isEmpty()) {

                if (contor % 2 == 0) {
                    button6.setText("X");
                    info.setText("Turn: O");

                } else {
                    button6.setText("O");
                    info.setText("Turn: X");
                }
                contor++;
                checkGame();
            }

        });

        button7.setOnMouseClicked((event) -> {

            if (button7.getText().isEmpty()) {

                if (contor % 2 == 0) {
                    button7.setText("X");
                    info.setText("Turn: O");

                } else {
                    button7.setText("O");
                    info.setText("Turn: X");
                }
                contor++;
                checkGame();
            }

        });

        button8.setOnMouseClicked((event) -> {

            if (button8.getText().isEmpty()) {

                if (contor % 2 == 0) {
                    button8.setText("X");
                    info.setText("Turn: O");

                } else {
                    button8.setText("O");
                    info.setText("Turn: X");
                }
                contor++;
                checkGame();
            }

        });

        button9.setOnMouseClicked((event) -> {

            if (button9.getText().isEmpty()) {

                if (contor % 2 == 0) {
                    button9.setText("X");
                    info.setText("Turn: O");

                } else {
                    button9.setText("O");
                    info.setText("Turn: X");
                }
                contor++;
                checkGame();
            }

        });
        
        
        
 
    

    }

   public void checkGame() {
       if(button1.getText()=="X" && button2.getText()=="X" && button3.getText()=="X") {
           
           gameState=true;
       } 
       
       if(!button1.getText().isEmpty()  && !button2.getText().isEmpty()  && !button3.getText().isEmpty()  && !button4.getText().isEmpty()  &&
               !button5.getText().isEmpty()  && !button6.getText().isEmpty()  && !button7.getText().isEmpty()  &&
               !button8.getText().isEmpty()  && !button9.getText().isEmpty()) {
           
           info.setText("The end!");
                  
       }
       
       if(gameState) {
           info.setText("The end!");
       }
       
       
   }
   
   public boolean isGameDone(boolean game) {
       
       if(game) {
           return true;
       }
       
       return false;
   }

    


    public static void main(String[] args) {

        launch(TicTacToeApplication.class);
        System.out.println("Hello world!");
    }

}
