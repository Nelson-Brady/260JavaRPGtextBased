/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noOneLeftBehind.control;


import java.util.Random;
import java.util.Scanner;
import noOneLeftBehind.model.*;
import noOneLeftBehind.view.*;


public class NoOneLeftBehind {

    //Member variables
    private static Player player = null;
    private static Game currentGame = null;
    
    //Getters setters

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        NoOneLeftBehind.player = player;
    }
  
     
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        NoOneLeftBehind.currentGame = currentGame;
    }
    
    
    
    //Functions
    
    public static void main(String[] args) {
        
        //System objects
        //Get input from user
        //Get random numbers
        Scanner in = new Scanner(System.in);   
        Random randGen = new Random();
        
        /***********************************************
        *This section is just for testing object instance creation
        *Remove this section when done
        *********************************************************/ 
        Player playerOne = new Player();
        playerOne.setName("Donald Trump");
        playerOne.setBestTime(800);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Display the Classes version of the game startup
        StartProgram startGame = new StartProgram();
        startGame.displayStartProgram();
        
        //Display the start game dialog
        GameScene opening = new GameScene();
        opening.displayOpening();
        
        boolean start = true;
        //Prompt user to start game
        //START:
        while(start){
            System.out.println("--------------------------------------------------------------- \n");
            System.out.println("Are you brave enough to enter the mansion to save your friend?");
            System.out.println("\t1. Fearlessly enter!!!");
            System.out.println("\t2. Run away!!! (Ends Game)");
            System.out.println("--------------------------------------------------------------- \n");
            String input = in.nextLine();
        
            if(input.equals("1")) {
                //Call display for the initial room dialog. 
                //This will be only time this room description is called.
                GameScene firstRoom = new GameScene();
                firstRoom.displayFirstRoom();
                start = false;
            }
            else if (input.equals("2")) {
                //TODO come up with exit game
                start = false;
            }
            else {
                System.out.println("---------------------------------------------------------------");
                System.out.println("You entered an incorrect choice. ");
                System.out.println("Please enter either 1 or 2 ");
                //continue START;
            }         
        }
        
        /*************************************************************
        *public void promptMovement(){
        *TODO will need fixing here...how will we track what options for each room???????  
        * 
        * User has decided to enter the building.  This is the very first time
        * he makes a decision about which direction to go
        * *********************************************************/
        System.out.println("--------------------------------------------------------------- \n");
        System.out.println("You have to make a decision.  Which way shalt thou go?");
        System.out.println("\t1. Go left");
        System.out.println("\t2. Go right");
        System.out.println("\t3. Go through door straight ahead");
        System.out.println("\t4. Go up the stairs - Bring on Level 2");
        System.out.println("--------------------------------------------------------------- \n");   
        String input = in.nextLine();
        
        if(input.equals("1")) {
            //User has decided to go left
            //TODO figure out what TODO
            ArtRoom firstRoom = new ArtRoom();
            firstRoom.displayArtRoom();
        }
        else if (input.equals("2")) {
            //TODO come up with exit game
            start = false;
        }
        else {
            System.out.println("---------------------------------------------------------------");
            System.out.println("You entered an incorrect choice. ");
            System.out.println("Please enter either 1 or 2 ");
            //continue START;
        }     
        
    }

}
