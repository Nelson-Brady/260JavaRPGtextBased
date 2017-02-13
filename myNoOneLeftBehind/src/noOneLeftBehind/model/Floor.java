/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Wrong package
//package byui.cit260.dsTest.model;

// Needs to be this
package noOneLeftBehind.model;

import java.io.Serializable;

/**
 *
 * @author DS
 */
public class Floor implements Serializable{
    
// class instance variables
    private boolean roomNumber;
 
// default constructor
    public Floor() {
    }
    
// Getters and Setters
    public boolean isRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(boolean roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.roomNumber ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Floor{" + "roomNumber=" + roomNumber + '}';
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
        final Floor other = (Floor) obj;
        if (this.roomNumber != other.roomNumber) {
            return false;
        }
        return true;
    }
    
}
