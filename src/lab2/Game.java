/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author gcDataTechnology
 */
public class Game {
    
    private boolean gameOn=false;
    private boolean timerOn=false;
    private int BONUS_TIMED_OUT=10000;
    private String mapName;
    
    
    
    
    //constructor
    public Game(){
        
    }

    public Game(String mapName, boolean timerOn) {
        this.mapName = mapName;//design concepts sets an emumerated list in a drop down box in the GUI, then converts to String
        this.timerOn=timerOn;
        gameOn=true;
    }
    
    
    public final void charactersFightEachOther(GameCharacter x, GameCharacter y){
       //first character
        int s=generateLossOfStrength(x.getStrength(), y.getStrength());
        x.setStrength(s,false);
        
        //second character
        s=generateLossOfStrength(x.getStrength(), y.getStrength());
        y.setStrength(s,false);
    }
    
    private int generateLossOfStrength(int xStrength, int yStrength){
        int s=0;
        //random number generated here based upon current strength and % of attack
        return s;
    }
    
    
    //getters & setters
    public boolean isGameOn() {
        return gameOn;
    }

    public void turnGameOn() {
        this.gameOn = true;
    }
    
    public void turnGameOff(){
        this.gameOn=false;
    }

   
    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }
    
    
}
