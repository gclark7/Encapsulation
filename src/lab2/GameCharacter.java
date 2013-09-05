/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author gcDataTechnology
 */
public class GameCharacter {
    
    private String characterType;
    private String characterName;
    private int strength;
    private int speed;
    private int points;
    private final int DYING = 2;
    
    
    
    //constructor
    public GameCharacter(){
        
    }

    public GameCharacter(String characterType, String characterName, int strength, int speed) {
        this.characterType = characterType;
        this.characterName = characterName;
        this.strength = strength;//used as strength and health
        this.speed = speed;
               
    }
    
    //incrimental methods
    public void monitorCharacter(){//runs monitor methods
        reportCharacterStatus();//would update a dialog box for GUI
       
    }
    
    //method 1
    private boolean isCharacterDying(){//compares strength to min value
        boolean x=false;
        if(getStrength()<=DYING){
            x=true;
        }
        return x;
    }
    
    //method 2
    private String reportCharacterStatus(){//reports health status of character
        String status=getCharacterName() + " is ";
        if(isCharacterDying()){//runs method 1
            status+="Dying";
        }else{status+="Healthy";}
        
        return status;
    }
    
    public void hurtCharacter(int x){
        strength-=x;
    }
    
    public void healCharacter(int x){
        strength+=x;
    }
    
    private void increaseRank(int pts ){//step final
        //points >= RANK then level up
    }
    
    
    
    
    //getters & setters
    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    
    
}
