package chapter_18.exirces_2;

import java.io.File;
import java.util.List;

public class SortedDirListDemo {
    public static void main(String[] args) {
        SortedDirList sortedDirList = new SortedDirList(new File("."));
        List<File> files = sortedDirList.list(new DirFilter(".*"));
        for(File file: files)
            System.out.println(file.getName());
    }
}
