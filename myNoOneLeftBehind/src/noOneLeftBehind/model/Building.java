/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noOneLeftBehind.model;

import java.io.Serializable;

/****
 *
 * @author DS
 */
public class Building implements Serializable{
  
    // class instance variables
    private boolean isLocked;
    private boolean hasFound;
    private boolean hasCleared;
    // default constructor
    public Building() {
    }
    // Getters and Setters
    public boolean isIsLocked() {
        return isLocked;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public boolean isHasFound() {
        return hasFound;
    }

    public void setHasFound(boolean hasFound) {
        this.hasFound = hasFound;
    }

    public boolean isHasCleared() {
        return hasCleared;
    }

    public void setHasCleared(boolean hasCleared) {
        this.hasCleared = hasCleared;
        
     
             
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.isLocked ? 1 : 0);
        hash = 79 * hash + (this.hasFound ? 1 : 0);
        hash = 79 * hash + (this.hasCleared ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Room{" + "isLocked=" + isLocked + ", hasFound=" + hasFound + ", hasCleared=" + hasCleared + '}';
    }

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
        final Building other = (Building) obj;
        if (this.isLocked != other.isLocked) {
            return false;
        }
        if (this.hasFound != other.hasFound) {
            return false;
        }
        if (this.hasCleared != other.hasCleared) {
            return false;
        }
        return true;
    }
    
    
}
