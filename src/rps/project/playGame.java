/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rps.project;

import java.util.ArrayList;

/**
 *
 * @author Saanji Shah
 */
public class playGame {
    compare arrays= new compare();
    public ArrayList<Integer> setData(ArrayList<Integer> allMoves){
        for(int i = 0; i<16;i++){
            allMoves.add((int) Math.floor(Math.random()*3)+1);
        }
        return allMoves;
    }
    public String checkWin(int move, int Compmove){
        if(move>Compmove){
            return "wins";
        }
        else if(move==1 && Compmove==3){
            return "wins";
        }
        else if(Compmove==move){
            return "ties";
        }
        else if(Compmove>move){
                return "losses";
        }
        if(move==3 && Compmove==1){
            return "losses";
        }
        return "mistake";//Never should return
    }
    public String setArrays(ArrayList<Integer> allMoves, ArrayList<Integer> userMoves, int move, String results){
        if(allMoves.size()<18){
            for(int y = 0; y<5;y++){
                userMoves.add(allMoves.get(allMoves.size()-5 +y));
            }
            int Compmove = (int) Math.floor(Math.random()*3)+1;
            results = checkWin(move,Compmove);
            System.out.println(userMoves);
        }else{
            for(int k = 0; k <4;k++){
                userMoves.set(k, userMoves.get(k+1));
            }
            userMoves.set(4,move);
            int Compmove = arrays.getCompMove(userMoves, allMoves);
            results = checkWin(move,Compmove);
            System.out.println("CM: " + Compmove);
        }
        return (results);
    }
}
