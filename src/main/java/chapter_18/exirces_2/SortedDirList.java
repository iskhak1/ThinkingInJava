package chapter_18.exirces_2;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedDirList {
    private File path;
    private List<File> sortedList;
    private List<File> matches;
    public SortedDirList(File path){
        this.path = path;
        sort();
    }

    private void toUpList(){
        sortedList = new ArrayList<>();
        File[] files = path.listFiles();
        for(File file: files){
            sortedList.add(file);
        }
    }
    private List<File> sort(){
        toUpList();
        sortedList.sort(new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return sortedList;
    }

    public List<File> list(){

        return sortedList;
    }

    public List<File> list(DirFilter filter){
        matches = new ArrayList<>();
        for (int i = 0; i < sortedList.size(); i++) {
            if(filter.accept(this.path,sortedList.get(i).getName())){
                matches.add(sortedList.get(i));
            }
        }
        return matches;
    }
}
