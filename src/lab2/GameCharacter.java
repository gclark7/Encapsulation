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
    private final int DYING = 2;//doesn't like DYING, not descriptive enough
    //use a term that grandma can understand
    //dyingThreshold
    
    
    
    //constructor
    public GameCharacter(){
        
    }

    public GameCharacter(String characterType, String characterName, int strength, int speed) {
        setCharacterType(characterType);
        setCharacterName(characterName);
        setStrength(strength,true);//used as strength and health
        setSpeed(speed);
               
    }
    
    //incrimental methods
    public final void monitorCharacter(){//runs monitor methods
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
    
    
    
    private void hurtCharacter(int x){
        strength-=x;
    }
    
    private void healCharacter(int x){
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
        //perform error checking
        //check null string, no string, 0 length
        this.characterType = characterType;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        //perform error checking
        //check null string, no string, 0 length
        this.characterName = characterName;
    }

    public int getStrength() {
        return strength;
    }

    public final void setStrength(int strength, boolean heal) {//adjusts player strength 
        //perform error checking
        //no negative values
        
        if(heal){
            healCharacter(strength);
        }else{hurtCharacter(strength);}
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
         //perform error checking
        //no negative values
        this.speed = speed;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
         //perform error checking
        //no negative values
        this.points = points;
    }
    
    
    
}
