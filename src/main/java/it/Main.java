package it;

import java.io.*;

/**
 *
 */
public final class Main {
    /**
     * main constructor
     */
    private Main() {

    }
    /**
     * @param args standard input arguments
     * @throws IOException exceptions
     */
    public static void main(final String[] args) throws IOException {
        File firstFile = new File("Homework3.txt");
        File file = new File("MyHomework.txt");
        file.createNewFile();
        InputStream fileStream = new FileInputStream(firstFile);
        byte[] bytes = new byte[fileStream.available()];
        fileStream.read(bytes, 0, bytes.length);
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
        printWriter.println(new String(bytes));
        String name = "Мякишива";
        printWriter.println(new String(name.getBytes()));
        printWriter.flush();
        printWriter.close();
    }
}
