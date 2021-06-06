/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rps.project;

import java.util.ArrayList;

/**
 *
 * @author shah1932
 */
public class compare {
    int numMatch =0;
    boolean match = false;
    int hold =0;
    int compMove = 0;
    int nextMove =1;
    int nextComp = 0;
    public int getCompMove(ArrayList<Integer> users, ArrayList<Integer> all){
        compMove = nextComp;
        int freq = 0;
        int count=0;
//        System.out.println("OG CM: " + compMove);
        for(int i = 0; i<all.size()-6;i++){
            numMatch = 0;
            for(int j =0; j<users.size();j++){
                if(users.get(j)==all.get(j+i)){
                    numMatch++;
                    if(numMatch==5){
                        count++;
                        System.out.println("Count: " + count);
                        match=true;
                        if(hold==all.get(i+6) || count > 1){
                            freq++;
                            System.out.println("Freq: " + freq);
                        }else{
                           nextMove = all.get(i+5);
                        }
                        System.out.println("NM: " + nextMove);
                        if(nextMove==1){
                            nextComp=2;
                        }
                        else if(nextMove==2){
                            nextComp=3;
                        }
                        else if(nextMove==3){
                            nextComp=1;
                        }
//                        System.out.println("NC: " + nextComp);
                        hold=nextMove;
                    }else if(compMove==0){
                        compMove = (int) Math.floor(Math.random()*3)+1; 
                    }
                }
            }
        }
        return compMove;
    }
}
