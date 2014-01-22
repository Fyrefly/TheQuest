/*** The Quest - 2014 (FBA) ***/

package game.player;

import game.env.item.Item;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author FBA
 */
public class Inventory {
    
    /** Stores the items and their count. */
    private final HashMap<Item, Integer> items = new HashMap<>();
    
    public Inventory() {
        // Empty Inventory
    }
    
    public Set<Item> getItems() {
        return items.keySet();
    }
    
    public boolean isEmpty() {
        return items.isEmpty();
    }
    
    public void removeItem(final Item item) {
        if(items.containsKey(item)) {
            Integer itemCount = items.get(item);
            if(itemCount.intValue() > 1) {
                itemCount--;
            } else {
                // Remove item if there is none left
                items.remove(item);
            }
        }
    }

}
