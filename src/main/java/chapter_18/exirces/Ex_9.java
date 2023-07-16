package chapter_18.exirces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex_9 {

    private List<String> objStr;
    private ListIterator<String> it;

    public Ex_9(){
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


        it = objStr.listIterator(objStr.size());
        while(it.hasPrevious())
            strB.append(it.previous().toUpperCase()+"\n");


        br.close();
        return strB.toString().toUpperCase();
    }


}
