package chapter_18.exirces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex_10 {

    private List<String> objStr;
    private ListIterator<String> it;

    public Ex_10(){
        objStr = new LinkedList<>();
    }

    public String  read(String file,String rex) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(file)
        );

        String s;
        StringBuilder strB = new StringBuilder();

        while((s = br.readLine())!= null) {
            objStr.add(s);
            if(search(s,rex)==true){
                strB.append(s+"\n");
            }
        }


        br.close();
        return strB.toString();
    }

    private boolean search(String str,String rex){
        String[] strS = str.split(" ");
        for(String s:strS)
            if(s.equals(rex))
                return true;
        return false;
    }

}
