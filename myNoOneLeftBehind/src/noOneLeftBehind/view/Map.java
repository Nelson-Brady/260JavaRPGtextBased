/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noOneLeftBehind.view;

import java.io.Serializable;

/**
 *
 * @author Alexis
 */

public class Map implements Serializable {

    // Member Variables
    private int activeFloor;
    private int activeRoom;
    
    //Consructors.
    public Map() {
    }
    
    //Getters and Setters
    public int getActiveFloor() {
        return activeFloor;
    }

    public void setActiveFloor(int activeFloor) {
        this.activeFloor = activeFloor;
    }

    public int getActiveRoom() {
        return activeRoom;
    }

    public void setActiveRoom(int activeRoom) {
        this.activeRoom = activeRoom;
    }


    //Equals and Hash code
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.activeFloor;
        hash = 61 * hash + this.activeRoom;
        return hash;
    }

    //Hashcode toString
    @Override
    public String toString() {
        return "Map{" + "activeFloor=" + activeFloor + ", activeRoom=" + activeRoom + '}';
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
        final Map other = (Map) obj;
        if (this.activeFloor != other.activeFloor) {
            return false;
        }
        if (this.activeRoom != other.activeRoom) {
            return false;
        }
        return true;
    }

}