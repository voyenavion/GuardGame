import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by shaungould on 2/25/16.
 */
public class GuardGameTest {

    GuardGame guardGame;
    @Before
    public void init(){
        guardGame = new GuardGame();
    }


    @Test
    public void testChangeLongIntoArrayListOfSingleDigits() throws Exception {
        long input = 12345;
        int expected = 5;
        int actual = guardGame.changeLongIntoArrayOfSingleDigits(input).size();
        assertEquals(expected,actual);
    }

    @Test
    public void testSumIntArray() throws Exception {
        ArrayList<Integer> intAL = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        int expected = 15;
        int actual = guardGame.sumIntArrayList(intAL);
        assertEquals(expected,actual);
    }

    @Test
    public void testAnswerGuardGame() throws Exception {
        long input = 123457;
        int expected = 4;
        int actual = guardGame.answerGuardGame(input);
        assertEquals(expected,actual);
    }
}