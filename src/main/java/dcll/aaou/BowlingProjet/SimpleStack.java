package dcll.aaou.BowlingProjet;

import java.util.EmptyStackException;

/**
 * Created by root on 14/04/16.
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty.
     *
     * @return boolean
     */
    boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     *
     * @return int
     */
    int getSize();

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item un item
     * @retun
     */
    void push(Item item);

}
