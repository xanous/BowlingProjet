package dcll.aaou.BowlingProjet;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Created by root on 15/04/16.
 */
public class BowlingTest {

    Bowling bowling;

    @Before
    public void setUp() throws Exception {
        bowling = new Bowling();
    }

    @Test
    public void testCalculerScore() throws Exception {
        Stack<Item> jeu1 = new Stack<Item>();
        jeu1.add(0, new Item(10, 0));
        jeu1.add(1, new Item(10, 0));
        jeu1.add(2, new Item(10, 0));
        jeu1.add(3, new Item(10, 0));
        jeu1.add(4, new Item(10, 0));
        jeu1.add(5, new Item(10, 0));
        jeu1.add(6, new Item(10, 0));
        jeu1.add(7, new Item(10, 0));
        jeu1.add(8, new Item(10, 0));
        jeu1.add(9, new Item(10, 0));
        jeu1.add(10, new Item(10, 0));
        jeu1.add(11, new Item(10, 0));
        assertEquals(bowling.calculerScore(jeu1), 300);

        Stack<Item> jeu2 = new Stack<Item>();
        jeu2.add(0, new Item(5, 5));
        jeu2.add(1, new Item(5, 5));
        jeu2.add(2, new Item(5, 5));
        jeu2.add(3, new Item(5, 5));
        jeu2.add(4, new Item(5, 5));
        jeu2.add(5, new Item(5, 5));
        jeu2.add(6, new Item(5, 5));
        jeu2.add(7, new Item(5, 5));
        jeu2.add(8, new Item(5, 5));
        jeu2.add(9, new Item(5, 5));
        jeu2.add(10, new Item(5, 5));
        jeu2.add(11, new Item(0, 0));
        assertEquals(bowling.calculerScore(jeu2), 150);

        Stack<Item> jeu3 = new Stack<Item>();
        jeu3.add(0, new Item(5, 0));
        jeu3.add(1, new Item(5, 0));
        jeu3.add(2, new Item(5, 0));
        jeu3.add(3, new Item(5, 0));
        jeu3.add(4, new Item(5, 0));
        jeu3.add(5, new Item(5, 2));
        jeu3.add(6, new Item(5, 0));
        jeu3.add(7, new Item(5, 0));
        jeu3.add(8, new Item(5, 0));
        jeu3.add(9, new Item(5, 0));
        jeu3.add(10, new Item(0, 0));
        jeu3.add(11, new Item(0, 0));
        assertEquals(bowling.calculerScore(jeu3), 52);

        assertEquals(jeu3.get(5).getSecondTry(), 2);

        Stack<Item> jeu4 = new Stack<Item>();
        jeu4.add(new Item(9, 0));
        jeu4.add(new Item(9, 1));
        jeu4.add(new Item(8, 2));
        jeu4.add(new Item(9, 0));
        jeu4.add(new Item(10, 0));
        jeu4.add(new Item(7, 0));
        jeu4.add(new Item(9, 0));
        jeu4.add(new Item(10, 0));
        jeu4.add(new Item(6, 4));
        jeu4.add(new Item(3, 0));
        jeu4.add(new Item(0, 0));
        jeu4.add(new Item(0, 0));

        assertEquals(bowling.calculerScore(jeu4), 124);
    }
}