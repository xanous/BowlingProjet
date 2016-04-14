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
    private final int maxScore = 10;

    /**
     * constructeur.
     *
     * @param first  the firstTry
     * @param second the secondTry
     */
    public Item(final int first, final int second) {
        this.firstTry = first;
        this.secondTry = second;
    }

    /**
     * accesseur du firstTry.
     *
     * @return firstTry
     */
    public final int getFirstTry() {
        return firstTry;
    }

    /**
     * accesseur du secondTry.
     *
     * @return secondTry
     */
    public final int getSecondTry() {
        return secondTry;
    }

    /**
     * accesseur du secondTry.
     *
     * @return firstTry + secondTry
     */
    public final int getTotalScore() {
        return firstTry + secondTry;
    }

    /**
     * etat de la lancer.
     *
     * @return int
     */
    public final int getStatus() {
        if (firstTry == maxScore) {
            return 2;
        }
        if (getTotalScore() == maxScore) {
            return 1;
        }
        return 0;
    }
}
