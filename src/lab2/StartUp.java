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
        
        GUI playerHUD=new GUI();//initial startup window
        
        do{
            //sits in an endless loop waiting for user to push start
            //push start already...
            System.out.println("NOT ready");
        }while(!playerHUD.isGameReady());
            
       //Oh user is finally ready
       //launch the game
        playerHUD.launchGame();
        
        //game play is controlled from GameWorld and interacts with GUI
        //Game defines game activity and how it affects characters
        //GameCharacter data is displayed on the GUI, methods are called from GameWorld & Game
        
        //add some information
        
        //trying to add info...
            playerHUD.updateInitialHUD();
            playerHUD.repaint();
    }
    
}
