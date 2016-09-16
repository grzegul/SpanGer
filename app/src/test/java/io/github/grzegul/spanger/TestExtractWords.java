package io.github.grzegul.spanger;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class TestExtractWords {
    MainActivity ma = new MainActivity();

    @Test
    public void testMainExtractWords_extractCorrect(){
        String expected = "wiosna primavera Frühling";
        assertEquals(expected, ma.extractWords(1));
        expected = "lato verano Sommer";
        assertEquals(expected, ma.extractWords(2));
        expected = "jesień otońo Herbst";
        assertEquals(expected, ma.extractWords(3));
        expected = "zima invierno Winter";
        assertEquals(expected, ma.extractWords(4));
    }

}