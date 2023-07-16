package chapter_18.exirces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex_7 {

    private List<String> objStr;
    private ListIterator<String> it;

    public Ex_7(){
        objStr = new LinkedList<>();
    }

    public String  read(String file) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(file)
        );

        String s;
        StringBuilder strB = new StringBuilder();

        while((s = br.readLine())!= null)
            objStr.add(s);

//        String[] strA = (String[]) objStr.toArray();
//        for(String str: strA){
//            System.out.println();
//        }
//        objStr.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
        it = objStr.listIterator(objStr.size());
        while(it.hasPrevious())
            strB.append(it.previous()+"\n");

        br.close();
        return strB.toString();
    }


}
