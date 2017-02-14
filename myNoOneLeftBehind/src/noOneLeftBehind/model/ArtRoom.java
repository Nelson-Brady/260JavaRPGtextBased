/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noOneLeftBehind.model;

import noOneLeftBehind.view.*;



/**
 *
 * @author Alexis
 */
public class ArtRoom {
    
    //Private member variables
    private boolean doorLeft;
    private boolean doorRight;
    private boolean doorUp;
    private boolean doorDown;
    private boolean stairsLevel;
    private boolean stairsOutside;
    private boolean hasFound = false;
    private boolean hasCleared = false;
    private int level;

    public ArtRoom() {
    }
    
    
    //Should move view stuff to view....
    public void displayArtRoom() {
    //This will be for the very first room only...   
    System.out.println("--------------------------------------------------------------- \n");
    System.out.println("You bravely choose to enter the room to the left! ");
    if(!hasCleared){
        System.out.println("As you enter the room, something immediately attacks you!!! ");
        //Go to battle!
        BattleScene battle = new BattleScene();
        battle.displayBattle();

//System.out.println("new surroundings.  It would appear nothing has been here in years.  ");
    }
    System.out.println("--------------------------------------------------------------- \n");    
    }
    
    
    
    
}
