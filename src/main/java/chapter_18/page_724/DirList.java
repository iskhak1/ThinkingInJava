package chapter_18.page_724;

import java.io.File;
import java.util.Arrays;

public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if(args.length==0)
            list = path.list();
        else
            list = path.list(new DirFilter(".java"));

        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
            for(String dirItem: list)
                System.out.println(dirItem);

    }
}
