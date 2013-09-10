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


public class GUI extends JFrame{
    //would be used to create the GUI display
    private final int WIDTH=1200;
    private final int HEIGHT=250;
    private JPanel infoPanel=new JPanel();
    private JPanel vitalPanel=new JPanel();
    private JPanel cmndPanel=new JPanel();
    private JPanel atckPanel=new JPanel();
    private JPanel dfndPanel=new JPanel();
    private JLabel lbl;
    private JButton btn;
    private ImageIcon image;
    
    //used to create the game instance
    private GameWorld gW;//Good planning, but Game would better control the worlds and the characters
    private String[] gameData;
    private boolean gameReady;
    
    
    
    //get some info from the user
    //use some buttons and txtBoxes to enter appropriate data for characters & map selection
    
    
    //create the world
    public GUI(){
        //build the GUI and a lot of JFrame Window Happiness for user interaction
        //initial window to enter user data
       super("GameDay");
        setLayout(new BorderLayout(5,10));
         //clr=(Color)player.team.toString();

         //exit on close
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         infoPanel.setLayout(new GridLayout(1,4));
         //attempting to color background according to team color
         //infoPanel.setForeground(clr);
         infoPanel.setBorder(BorderFactory.createTitledBorder("PLAYER INFO"));
         
         lbl=new JLabel("Info Panel");
         
         //lbl.setSize(50, 50);
         infoPanel.add(lbl);
         add(infoPanel,BorderLayout.NORTH);
         
         vitalPanel.setLayout(new GridLayout(7,2));
         vitalPanel.setBorder(BorderFactory.createTitledBorder("VITALS"));
         btn=new JButton("Ready");
         btn.setName("cmdReady");
         btn.addActionListener(new StartGame());
         vitalPanel.add(btn);
         
         add(vitalPanel,BorderLayout.WEST);
         add(atckPanel,BorderLayout.CENTER);
         add(dfndPanel,BorderLayout.EAST);
         add(cmndPanel,BorderLayout.SOUTH);
         
         pack();
         setVisible(true);
    }
    
    //Create the real world for game
    //method 4 ensures data integrity
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
      
    public final void refreshGUI(){
        //refresh GUI so it displays new data values after character activity
    }
    
    //Single Purpose is to launch the game by communicating the necessary data to the necessary Classes 
    private class StartGame implements ActionListener{//GUI Ready Button, btnReady
        @Override
        public void actionPerformed(ActionEvent e){
            
            //retrieve player data from txtFields
            //send values to another method
            //simulates getting data from txtBoxes
            if(!isGameReady()){
                String[] gameData= new String[]{"characterType","playerName","mapSelection"};
                setGameData(gameData);
                setGameReady(true);
            }
        }
   }
        
   //Single purpose is to fight opponents
    private class FightEnemy implements ActionListener{//GUI Ready Button, btnReady
        @Override
        public void actionPerformed(ActionEvent e){
            
            //retrieve player data from txtFields
            //send values to another method
            //simulates getting data from txtBoxes
           //communicate somehow with game methods for fighting
            gW.getLevel().charactersFightEachOther(gW.getPlayerCharacter(), gW.getAiCharacter());
            refreshGUI();
        }
   }
    
   
   
    
    //getters & setters
    public void setGameReady(boolean ready){
        gameReady=ready;
    }
    
    public void updateInitialHUD(){
      lbl=new JLabel(gW.getPlayerCharacter().getCharacterName());
         
            infoPanel.add(lbl);
            //add(infoPanel,BorderLayout.NORTH);
            
  }
    
    public int getHEIGHT(){
        return HEIGHT;
    }
    
    public int getWIDTH(){
        return WIDTH;
    }
    
    
    
   
}
