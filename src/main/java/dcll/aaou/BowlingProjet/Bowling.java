package dcll.aaou.BowlingProjet;

import java.util.Stack;

/**
 * Created by root on 14/04/16.
 */
public class Bowling {
    /**
     * frame maximum.
     */
    private final int maxFrame = 12;
    /**
     * frame.
     */
    private final int frame = 10;
    /**
     * calcule le score total.
     * @param stack une liste de jeu
     * @return int
     */


    public final int calculerScore(final Stack<Item> stack) {
        int scoreTotal = 0;

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
