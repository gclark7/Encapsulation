/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author gcDataTechnology
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI {
    
    GameWorld gW;
    String[] gameData;
    boolean gameReady;
    
    
    
    //get some info from the user
    //use some buttons and txtBoxes to enter appropriate data for characters & map selection
    
    
    //create the world
    public GUI(){
        //build the GUI and a lot of JFrame Window Happiness for user interaction
        //initial window to enter user data
    }
    
    //Create the real world for game
    
    public void launchGame(){//create the game environment
        if(isGameReady()){
            String[] d=getGameData();
            gW = new GameWorld(d[0],d[1],d[2]);
        }
    }
    //1 & 2 are set by an command button in GUI start pannel
    //method 1`
    private final void setGameData(String[] gameData){//sets game values
        
        this.gameData=gameData;
    }
    
        
    //method 2
    public final boolean isGameReady(){
        return gameReady;
    }
    
    //method 3
      public String[] getGameData(){
        return gameData;
    }
    
    //Single Purpose is to launch the game by communicating the necessary data to the necessary Classes 
    private class StartGame implements ActionListener{//GUI Ready Button, btnReady
        @Override
        public void actionPerformed(ActionEvent e){
            
            //retrieve player data from txtFields
            //send values to another method
            //simulates getting data from txtBoxes
            String[] gameData= new String[]{"characterType","playerName","mapSelection"};
            setGameData(gameData);
            setGameReady(true);
        }
   }
        
   
    private class FightEnemy implements ActionListener{//GUI Ready Button, btnReady
        @Override
        public void actionPerformed(ActionEvent e){
            
            //retrieve player data from txtFields
            //send values to another method
            //simulates getting data from txtBoxes
           //communicate somehow with game methods for fighting
            gW.level.charactersFightEachOther(gW.playerCharacter, gW.aiCharacter);
        }
   }
    
   
   
    
    //getters & setters
    public void setGameReady(boolean ready){
        gameReady=ready;
    }
    
  
    
    
    
   
}
