/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noOneLeftBehind.control;

/**
 *
 * @author Alexis
 */
public class GatePuzzle {
    
    //TODO variables?
    float goldWeight = 30;
    float silverWeight = 10;
    
    //TODO other stuff??
    
    public boolean checkGatePuzzle(int gold, int silver, int total, float goldPercentage){
        
        
        //Check right answer
        float silverPercentage = 100 - goldPercentage;
        float correctGold, correctSilver;
        correctGold = total * (goldPercentage / 100) / goldWeight;
        correctSilver = total * (silverPercentage / 100) / silverWeight;
        
        if(gold == correctGold && silver ==correctSilver){
            return true;
        }
        else
            return false;   
    }
    
}
