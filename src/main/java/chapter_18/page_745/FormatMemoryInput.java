package chapter_18.page_745;

import chapter_18.page_743.BufferedInputFile;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormatMemoryInput {

    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(BufferedInputFile.read(args[0]).getBytes()));
            while(true)
                System.out.print((char)in.readByte()+" ");


        }catch (EOFException e){
            System.out.println("End of stream");
        }
    }
}
