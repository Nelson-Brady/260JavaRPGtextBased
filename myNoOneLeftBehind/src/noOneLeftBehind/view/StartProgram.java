/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noOneLeftBehind.view;

import java.util.Scanner;
import noOneLeftBehind.control.*;
import noOneLeftBehind.model.*;

/**
 *
 * @author Alexis
 */
public class StartProgram {
    
    private String promptMessage;

    public StartProgram() {
        
        //Display the prompt message
        this.promptMessage = "\nPlease enter your brave hero's name: ";

        //Display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        
        System.out.println(
                "\n********************************************"
                +"\n*           No One Left Behind            *"
                +"\n*         A simple dungeon crawl,         *"
                +"\n*             text based RPG              *"
                +"\n*             By Brady Nelson             *"
                +"\n*                                         *"
                +"\n*******************************************"          
                
        );
        
        
    }

    public void displayStartProgram() {
        
        boolean done = false;  // set flag to !done
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user is a quitter
                return; // quit
            
            //Do the requested action and display the next view
            done = this.doAction(playersName);
        }while (!done);
    }

    private String getPlayersName() {
            
        Scanner keyboard = new Scanner(System.in); //get inFile for keyboard
        String value = "";  // value to be returned
        boolean valid = false;  //so we can change to true when valid input
        
        while (!valid) {  //loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();  //get next line from keyboard
            value = value.trim();  //Trims leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: Value van not be blank");
                continue;
            }
            
            break;  // end the loop
        }
        
        return value;
    }
    
    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                + "The name must be greater than one character in length");
            return false;
        }
        
        //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { //if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        
        //display next view
        this.displayNextView(player);
    
        return true;  // a great success! // false will redisplay
    }
    
    
    private void displayNextView(Player player) {
        //Display message to player
        System.out.println("\n================================="
                           +"\n Welcome to the game, " + player.getName()
                           +"\n May luck guide you !"
                           +"\n================================="
                            );
        
        // Create main menu view object
        //MainMenuView mainMenuView = new MainMenuView();
        
        //Display the main menu view
        //mainMenuView.displayMainMenuView();
    }
    
    
}
