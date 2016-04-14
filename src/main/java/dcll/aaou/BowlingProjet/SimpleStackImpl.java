package dcll.aaou.BowlingProjet;

import java.util.Stack;

/**
 * Created by root on 14/04/16.
 */
public class SimpleStackImpl implements SimpleStack {

    /**
     * list jeu.
     */
    private Stack<Item> stack = new Stack<Item>();

    /**
     * constructeur.
     *
     * @param stack list de jeu
     */
    public SimpleStackImpl(Stack<Item> stack) {
        this.stack = stack;
    }

    /**
     * accesseur de stack.
     *
     * @return stack
     */
    public Stack<Item> getStack() {
        return stack;
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.add(item);
    }

    /**
     * calculer score total.
     *
     * @return int
     */
    public int calculerScore() {
        int scoreTotal = 0;
        final int maxFrame = 12;
        final int frame = 10;

        int[] tmpScore = new int[maxFrame];
        for (int i = 0; i < maxFrame; ++i) {
            tmpScore[i] = stack.get(i).getTotalScore();
        }
        for (int i = 0; i < frame; ++i) {
            if (stack.get(i).getStatus() == 2) {
                scoreTotal += tmpScore[i] + tmpScore[i + 1];
                if (stack.get(i + 1).getStatus() == 2) {
                    scoreTotal += stack.get(i + 2).getFirstTry();
                }
            } else if (stack.get(i).getStatus() == 1) {
                int next = stack.get(i + 1).getFirstTry();
                scoreTotal += tmpScore[i] + next;
            } else {
                scoreTotal += tmpScore[i];
            }
        }
        return scoreTotal;
    }
}
