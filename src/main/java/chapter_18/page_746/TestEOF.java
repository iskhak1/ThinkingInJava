package chapter_18.page_746;

import chapter_18.page_743.BufferedInputFile;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class TestEOF {
    public static void main(String[] args) throws IOException {
        try {
        DataInputStream in = new DataInputStream(
                new ByteArrayInputStream(BufferedInputFile.read(args[0]).getBytes()));
        while(in.available()!=0)
            System.out.print((char)in.readByte()+" ");


    }catch (
    EOFException e){
        System.out.println("End of stream");
    }
}

}
