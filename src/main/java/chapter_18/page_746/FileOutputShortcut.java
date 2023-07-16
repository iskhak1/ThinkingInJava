package chapter_18.page_746;

import chapter_18.page_743.BufferedInputFile;

import java.io.*;

public class FileOutputShortcut {

    static String file = "BasicFileOutputShortcut";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read(args[0])));
        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s ;
        while((s = in.readLine())!= null){
            out.println(lineCount++ + ": " + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }


}
