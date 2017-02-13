/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noOneLeftBehind.control;

import noOneLeftBehind.model.*;

/**
 *
 * @author Alexis
 */
public class GameControl {

    public static Player createPlayer(String name) {
       //called from StartProgram - do Action
       if (name == null) {
           return null;
       }
       
       Player player = new Player();
       player.setName(name);
       
       NoOneLeftBehind.setPlayer(player); // save the player
       
       return player;
    }
    
}
