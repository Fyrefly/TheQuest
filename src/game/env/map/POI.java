/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game.env.map;

/**
 *A general 'point of interest' with a specified location.
 * 
 * @author FBA
 */
public abstract class POI {
    
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
}
