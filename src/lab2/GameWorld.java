/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author gcDataTechnology
 */
public class GameWorld {
    private final int GREAT_HEALTH = 50;
    private GameCharacter playerCharacter;
    private GameCharacter aiCharacter;
    private Game level;
    private String mapName;
    
    //constructor
    public GameWorld(String characterType, String playerName, String mapName){
        
        playerCharacter = new GameCharacter(characterType, playerName, 50, 5);
        aiCharacter = new GameCharacter("RomanCenturian", "Spike", 60,4);

        level= new Game(mapName, false);
        setMapName(mapName);
    }
    
    public void playTheGame(){
        
        while(level.isGameOn())
        {
            //do everything here that would produce a fun gaming environment
            //call methods that build the map
            
            //call As NEEDED...Level advancement
            buildMap(getMapName());
            
           
        }
        
    
        
    }
    
    private void buildMap(String mapName){
        //check mapName against String comparison of MAP{} values
        //set a boolean value false until map is approved
        for(MAP m:MAP.values()){
            //compare here mapName==m.toString();
        }
        
        //if(!goodMap){
        //throw an error and start back at GUI
        //}
    }
    
    
    //setters & getters
    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }
    
    public GameCharacter getPlayerCharacter(){
        return playerCharacter;
    }
    public GameCharacter getAiCharacter(){
        return aiCharacter;
    }
    
    public Game getLevel(){
        return level;
    }
    
    public static enum MAP{LEVEL_1,LEVEL_2,LEVEL_3};
    
}
