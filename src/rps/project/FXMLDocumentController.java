/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rps.project;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Saanji Shah
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private ImageView imgPic;
    @FXML
    ArrayList <Integer> userMoves= new ArrayList<>();
    ArrayList <Integer> allMoves= new ArrayList<>();
    playGame game = new playGame();
    compare arrays= new compare();
    public int move;
    public int wins =0;
    public int ties =0;
    public int losses=0;
//    int Compmove =1;
    @FXML
    private Label result, win, tie, loss;
    @FXML
    private void start(ActionEvent event) {
        allMoves = game.setData(allMoves);
        System.out.println("Start" + allMoves);
    }
    @FXML
    private void rockFunc(ActionEvent event) {
        move=1;
//        imgPic.setImage(new Image("resources/rock.png"));
        System.out.println("Rock");
        playGame();
    }
    @FXML
    private void paperFunc(ActionEvent event) {
        move=2;
        System.out.println("Paper");
        playGame();
    }
    @FXML
    private void scissFunc(ActionEvent event) {
        move=3;
        System.out.println("Scissors");
        playGame();
    }
    private void playGame(){
        String results = "";
        allMoves.add(move);
        results = game.setArrays(allMoves, userMoves, move, results);
        
        System.out.println(userMoves + " " + allMoves);
        if(results.equals("wins")){
            wins++;
        }
        else if(results.equals("ties")){
            ties++;
        }
        else if(results.equals("losses")){
            losses++;
        }
        win.setText(Integer.toString(wins));
        tie.setText(Integer.toString(ties));
        loss.setText(Integer.toString(losses));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
