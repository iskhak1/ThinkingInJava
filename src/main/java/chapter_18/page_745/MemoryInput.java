package chapter_18.page_745;

import chapter_18.page_743.BufferedInputFile;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {

    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read(args[0])
        );
        int c ;
        while((c = in.read())!=-1)
            System.out.print((char) c  + " ");
    }

}
