package chapter_18.exirces;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex_12 {

    private List<String> objStr;
    private ListIterator<String> it;

    public Ex_12(){
        objStr = new LinkedList<>();
    }

    public String read(String file) throws IOException {
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
    public void write(String file) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(file);
        for (int i = 0; i < objStr.size(); i++) {
            out.println(i+" " +objStr.get(i));
        }
        out.close();
    }

}
