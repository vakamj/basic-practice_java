package it.sevenbits;

import java.util.ArrayList;
import java.util.List;

/**
 * class Example
 */
public class Example {
    /**
     * @param fileReader FileReader
     * @return maxLengthLine
     */

    public int getLongestLineCharsCount(final FileReader fileReader) {
        int maxLengthLine = -1;
        List<String> list = new ArrayList<>();
        while (fileReader.hasMoreLines()) {
            list.add(fileReader.readLine());
        }

        for (String aList : list) {
            if (maxLengthLine < aList.length()) {
                maxLengthLine = aList.length();
            }
        }
        return maxLengthLine;
    }
}
