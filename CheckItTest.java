import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckItTest {

    @Test
    public void testPredicateCoverage() {
        // all true
        assertTrue(CheckIt.checkIt(true, true, true));

        // a false
        assertTrue(CheckIt.checkIt(false, true, true));

        // b and c false
        assertTrue(CheckIt.checkIt(true, false, false));

        // all false
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    @Test
    public void testForClauseCoverage() {
        // a true, b and c false
        assertTrue(CheckIt.checkIt(true, false, false));

        // a false, b true, c false
        assertFalse(CheckIt.checkIt(false, true, false));

        // a false, b and c true
        assertTrue(CheckIt.checkIt(false, true, true));
    }

    @Test
    public void testForCorrelatedActiveClauseCoverage() {
        // all true
        assertTrue(CheckIt.checkIt(true, true, true));

        // a and b true, c false
        assertTrue(CheckIt.checkIt(true, true, false));

        // a and c true, b false
        assertTrue(CheckIt.checkIt(true, false, true));

        // a true, b and c false
        assertTrue(CheckIt.checkIt(true, false, false));

        // a false, b and c true
        assertTrue(CheckIt.checkIt(false, true, true));

        // a false, b true, c false
        assertFalse(CheckIt.checkIt(false, true, false));

        // a and b false, c true
        assertFalse(CheckIt.checkIt(false, false, true));

        // all false
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    @Test
    public void testForRestrictedActiveClauseCoverage() {
        // all true
        assertTrue(CheckIt.checkIt(true, true, true));

        // a and b true, c false
        assertTrue(CheckIt.checkIt(true, true, false));

        // a and c true, b false
        assertTrue(CheckIt.checkIt(true, false, true));

        // a true, b and c false
        assertTrue(CheckIt.checkIt(true, false, false));

        // a false, b and c true
        assertTrue(CheckIt.checkIt(false, true, true));

        // a false, b true, c false
        assertFalse(CheckIt.checkIt(false, true, false));

        // a and b false, c true
        assertFalse(CheckIt.checkIt(false, false, true));

        // all false
        assertFalse(CheckIt.checkIt(false, false, false));
    }

}