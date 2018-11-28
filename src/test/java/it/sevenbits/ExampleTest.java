package it.sevenbits;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExampleTest {

    @Test
    public void getLongestLineCharsCount() {
        FileReader mockReader = mock(FileReader.class);
        when(mockReader.readLine()).thenReturn("onetwo");
        when(mockReader.hasMoreLines()).thenReturn(true, false);
        Example example = new Example();
        assertEquals(6, example.getLongestLineCharsCount(mockReader));
    }

    @Test(expected = IOException.class)
    public void getLongestLineCharsCountFileNotFind() throws IOException {
        FileReader reader = new FileReader(new File("gtrvf.txt"));
        Example example = new Example();
    }

    @Test(expected = IOException.class)
    public void getLongestLineCharsCountEmpty() throws IOException {
        FileReader reader = new FileReader(new File("src/test/resources/emptyFile.txt"));
        Example example = new Example();
    }


}