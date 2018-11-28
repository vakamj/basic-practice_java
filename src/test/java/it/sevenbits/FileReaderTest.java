package it.sevenbits;

import org.junit.Test;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FileReaderTest {

    @Test
    public void oneLine() throws IOException {
        FileReader oneLine = new FileReader(new File("src/test/resources/oneLine.txt"));
        assertEquals("oneLine.txt 1 one line", oneLine.readLine());
    }

    @Test
    public void twoLines() throws IOException {
        FileReader twoLines = new FileReader(new File("src/test/resources/twoLines.txt"));
        assertEquals("twoLines.txt 1 two", twoLines.readLine());
    }
}