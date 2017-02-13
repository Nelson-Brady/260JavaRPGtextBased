/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noOneLeftBehind.model;

/**
 *
 * @author Alexis
 */
public interface Enemy {

	/**
    * @param target The {@link Creature} we've encountered.
    */
	public void attack(Creature target);
}