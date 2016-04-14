package dcll.aaou.BowlingProjet;

/**
 * Created by root on 14/04/16.
 */
public class Item {

    /**
     * score de premier essai.
     */
    private final int firstTry;
    /**
     * score de deuxieme essai.
     */
    private final int secondTry;
    /**
     * score maximum.
     */
    private static int MAX_SCORE = 10;

    /**
     * constructeur.
     *
     * @param firstTry  the firstTry
     * @param secondTry the secondTry
     */
    public Item(int firstTry, int secondTry) {
        this.firstTry = firstTry;
        this.secondTry = secondTry;
    }

    /**
     * accesseur du firstTry.
     *
     * @return firstTry
     */
    public int getFirstTry() {
        return firstTry;
    }

    /**
     * accesseur du secondTry.
     *
     * @return secondTry
     */
    public int getSecondTry() {
        return secondTry;
    }

    /**
     * accesseur du secondTry.
     *
     * @return firstTry + secondTry
     */
    public int getTotalScore() {
        return firstTry + secondTry;
    }

    public int getStatus() {
        if (firstTry == MAX_SCORE) {
            return 2;
        }
        if (getTotalScore() == MAX_SCORE) {
            return 1;
        }
        return 0;
    }
}
