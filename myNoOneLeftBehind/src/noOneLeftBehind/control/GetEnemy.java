/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noOneLeftBehind.control;

import java.util.Random;

/**
 *
 * @author Alexis
 */
public class GetEnemy {
    
    public String genNewEnemy(){
    //Generate a random enemy
    Random randGen = new Random();
    String[] enemies = {"Skeleton", "Zombie", "Mummy", "Vampire"};
    String enemy = enemies[randGen.nextInt(enemies.length)];
    return enemy;
    }
//    
//    public String getEnemyType(){
//    //Create enemy instance of right type
//    String enemyType = genNewEnemy();
//        switch (enemyType) {
//            case "Skeleton":
//                Skeleton newSkeleton = new Skeleton();
//                enemy = newSkeleton;
//                break;
//            case "Zombie":
//                Zombie newZombie = new Zombie();
//                break;
//            case "Mummy":
//                Mummy newMummy = new Mummy();
//                break;
//            case "Vampire":
//                Vampire newVampire = new Vampire();
//                break;
//            default:
//                break;
//        }
//    return enemy;
//    }
    
}
