package chapter_18.exirces_3;

import chapter_18.page_724.DirFilter;

import java.io.File;
import java.util.Arrays;

public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        File[] files = path.listFiles();
        String[] list;
        if(args.length==0)
            list = path.list();
        else
            list = path.list(new DirFilter(".*"));

        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        int size = 0;
            for(String dirItem: list) {
                 File f = new File(path,dirItem);
                 System.out.printf("%-45s  size %d \n",f.getName(),f.length());
                 size+=f.length();
                }
          System.out.printf("Total size: %-45s ",size);
            }

    }

