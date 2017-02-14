/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noOneLeftBehind.view;

import noOneLeftBehind.control.*;



/**
 *
 * @author Alexis
 */
public class BattleScene {
    
        
    public void displayBattle() {
        
        //Get random monster
        GetEnemy newEnemy = new GetEnemy();
        String enemy = newEnemy.genNewEnemy();
        //String enemy = newEnemy.getEnemyType();
        
        //Display enemy information
        System.out.println("--------------------------------------------------------------- \n");
        System.out.println("It's a " + enemy + "!");
        
        //Get correct enemy type
        
        
        //Display combat message
        System.out.println("--------------------------------------------------------------- \n");
        System.out.println("\t1. Attack");
        System.out.println("\t2. Drink health potion");
        System.out.println("\t3. Run! -- Take 10 retreat damage. -- Cowardly undead, stabbing you in the back! ");
        System.out.println("--------------------------------------------------------------- \n");
    }
    
    //TODO for tomorrow
    //GENERATE MONSTER
    //TEST BATTLE
    //RANDOM MONSTERS?
}
