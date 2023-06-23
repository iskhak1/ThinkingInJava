package chapter_18;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if(args.length==0){
            list = path.list();
        }else{

        }
    }
}
