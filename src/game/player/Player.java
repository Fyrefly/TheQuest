/*** The Quest - 2014 (FBA) ***/

package game.player;

/**
 *
 * @author FBA
 */
public class Player {
    
    private final String name;
    
    private Inventory inventory;
    
    public Player() {
        // TODO FBA: getAvailableDefaultPlayerName()
        this("");
    }
    
    public Player(final String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

}
