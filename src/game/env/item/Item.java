/*** The Quest - 2014 (FBA) ***/

package game.env.item;

import java.util.Objects;

/**
 *
 * @author FBA
 */
public class Item {
    
    private String name;
    
    private ItemType type;
    
    public Item(final String name, final ItemType type) {
        this.name = name;
        this.type = type;
    }

    /**
     * HASHCODE / EQUALS
     */
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }

}
