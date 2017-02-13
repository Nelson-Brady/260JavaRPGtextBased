/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noOneLeftBehind.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Alexis
 */
public class Creature implements Serializable{
    
    //Private member variables
    private int hitPoints;
    private int baseAttack;
    private int baseArmor;
    private boolean isAlive;
    
    private Map<String, Integer> inventory;
    
    //Constructor
    public Creature() {
        this.inventory = new HashMap<>();
        this.hitPoints = hitPoints;
    }
    
    //Getter and setters
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getBaseArmor() {
        return baseArmor;
    }

    public void setBaseArmor(int baseArmor) {
        this.baseArmor = baseArmor;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public void setInventory(Map<String, Integer> inventory) {
        this.inventory = inventory;
    }

    
    //Hash Code
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.hitPoints;
        hash = 47 * hash + this.baseAttack;
        hash = 47 * hash + this.baseArmor;
        hash = 47 * hash + (this.isAlive ? 1 : 0);
        hash = 47 * hash + Objects.hashCode(this.inventory);
        return hash;
    }
    
    //To Sring
    @Override
    public String toString() {
        return "Creature{" + "hitPoints=" + hitPoints + ", baseAttack=" + baseAttack + ", baseArmor=" + baseArmor + 
                ", isAlive=" + isAlive + ", inventory=" + inventory + '}';
    }
    
    
    //Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Creature other = (Creature) obj;
        if (this.hitPoints != other.hitPoints) {
            return false;
        }
        if (this.baseAttack != other.baseAttack) {
            return false;
        }
        if (this.baseArmor != other.baseArmor) {
            return false;
        }
        if (this.isAlive != other.isAlive) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        return true;
    }
    
      
    
    
    //Inventory method - Adds imtems to inventory
    public void addInventory(String itemName, int itemValue) {
        inventory.put(itemName, itemValue);

    }

    
    
    
    
}
