/*** The Quest - 2014 (FBA) ***/

package game;

import game.player.Player;

/**
 *
 * Representation of a game, including a specified player and map.
 * 
 * @author FBA
 */
public class Game {
    
    private final Player player;
    
    private String name;

    public Game() {
        this(new Player());
    }
    
    public Game(final Player player) {
        this.player = player;
    }
    
    /** GETTERS / SETTERS **/
    
    public Player getPlayer() {
        return player;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
