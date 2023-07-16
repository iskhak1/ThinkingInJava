package chapter_18.exirces;

import java.io.IOException;

public class TestDriveEx_7 {

    public static void main(String[] args) throws IOException {
        Ex_12 ex7 = new Ex_12();
        if(args.length>0)
            System.out.println(ex7.read(args[0]));
        else System.out.println("Забыл написать имя файла");
        ex7.write("TESTDRIVE");

    }

}
