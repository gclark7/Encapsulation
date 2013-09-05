/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author gcDataTechnology
 */
public class StartUp {
    
    
    public static void main(String[] args) {
        
        GUI playerHUD;
        
        
        
        
        playerHUD=new GUI();//initial startup window
        
        do{
            //sit in an endless loop waiting for user to push start
            
        }while(!playerHUD.isGameReady());
            
       //Oh user is finally ready
        
        //launch the game
        playerHUD.launchGame();
    }
    
}
