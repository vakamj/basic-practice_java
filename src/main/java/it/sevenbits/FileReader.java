package it.sevenbits;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * class FileReader
 */
public class FileReader {

    private int nomberLine = 0;
    private File file;
    private List<String> list = new ArrayList<>();

    /**
     * FileReader constructor
     */
    private FileReader() {
    }

    /**
     * @param file file
     * @throws IOException exceptions
     */
    public FileReader(final File file) throws IOException {
        this.file = file;

        try (BufferedReader br = new BufferedReader(new java.io.FileReader(file))) {
            if (!br.ready()) {
                throw new IOException("file not found");
            }
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        }
    }

    /**
     * @return false or true
     */
    public boolean hasMoreLines() {

        if (nomberLine < list.size()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return file name, line number, line content
     */
    public String readLine() {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName()).append(" ").append(nomberLine + 1).append(" ").append(list.get(nomberLine));
        nomberLine++;
        return sb.toString();
    }

}