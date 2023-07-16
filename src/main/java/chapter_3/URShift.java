package chapter_3;

import com.sun.security.jgss.GSSUtil;

public class URShift {

    public static void main(String[] args) {
        int i = 15;
        String intToBin = Integer.toBinaryString(i);
        System.out.println(intToBin + " sings -> " + intToBin.split("").length);
        System.out.println(i);
        i = i >> 10 ;
        intToBin = Integer.toBinaryString(i);
        System.out.println(intToBin + " sings -> " + intToBin.split("").length);
        System.out.println(i);
        long l = -1;
        String longToBin = Long.toBinaryString(l);
        System.out.println(longToBin  + " sings -> " + longToBin .split("").length);
        l >>>=10;
        longToBin  = Long.toBinaryString(l);
        System.out.println(longToBin  + " sings -> " + longToBin .split("").length);
        short s = -1;
        String shortToBin = Integer.toBinaryString(s);
        System.out.println(shortToBin  + " sings -> " + shortToBin .split("").length);
        s >>>=10;
        shortToBin = Integer.toBinaryString(s);
        System.out.println(shortToBin  + " sings -> " + shortToBin .split("").length);
        byte b = -1;
        String byteToBin = Integer.toBinaryString(b);
        System.out.println(byteToBin  + " sings -> " + byteToBin .split("").length);
        b >>>= 10;
        byteToBin = Integer.toBinaryString(b);
        System.out.println(byteToBin  + " sings -> " + byteToBin .split("").length);
        b = -1;
        byteToBin = Integer.toBinaryString(b);
        System.out.println(byteToBin  + " sings -> " + byteToBin .split("").length);




    }

}
