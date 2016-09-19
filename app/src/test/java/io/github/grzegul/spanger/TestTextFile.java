package io.github.grzegul.spanger;

/**
 * Created by jgrzegulski on 2016-09-16.
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class TestTextFile {
    MainActivity ma = new MainActivity();
    //TextFile tf = new TextFile("src/main/java/io/github/grzegul/spanger/dBs.txt");
    String file = TextFile.read("src/main/java/io/github/grzegul/spanger/dB2.txt");
    String expected;
    @Test
    public void testTxtFile_readFile(){
        //expected = "wiosna primavera Frühling";
        expected = "lato verano Sommer\n";

        //System.out.println(file);
        assertEquals(expected, file);

    }

}