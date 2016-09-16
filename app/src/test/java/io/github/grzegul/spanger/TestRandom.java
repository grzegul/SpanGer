package io.github.grzegul.spanger;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class TestRandom {
    MainActivity ma = new MainActivity();

    @Test
    public void testRandomWord_givesPolishWordFromDbPolish() {
        assertNotNull(ma.randomWord());
    }
}