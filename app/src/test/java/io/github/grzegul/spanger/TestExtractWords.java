package io.github.grzegul.spanger;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class TestExtractWords {
    MainActivity ma = new MainActivity();
    String[] expected = new String[3];
    @Test
    public void testMainExtractWords_extractCorrect(){
        expected = new String[]{"wiosna", "primavera", "Frühling"};
        assertArrayEquals(expected, ma.extractWords(1));
        expected = new String[]{"lato", "verano", "Sommer"};
        assertArrayEquals(expected, ma.extractWords(2));
        expected = new String[]{"jesień", "otońo", "Herbst"};
        assertArrayEquals(expected, ma.extractWords(3));
        expected = new String[]{"zima", "invierno", "Winter"};
        assertArrayEquals(expected, ma.extractWords(4));
    }

}