package chapter_3;

import java.util.Random;

import static java.util.EnumSet.range;

public class BitManipulation {


    public static void main(String[] args){
        Random rand = new Random(47);
        int i = 64;
        int j = 4;
        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);
        int maxpos = 2147483647;
        printBinaryInt("Max positive ", maxpos);
        int maxneg = -2147483647;
        printBinaryInt("Max negative " , maxneg);
        printBinaryInt("i" ,i);
        printBinaryInt("~i" ,~i);
        printBinaryInt("-i" ,-i);
        printBinaryInt("j" ,j);
        printBinaryInt("i & j" ,i & j);
        printBinaryInt("i | j" ,i | j);
        printBinaryInt("i ^ j" ,i ^ j);
        printBinaryInt("i << 5",i << 5);
        printBinaryInt("i >> 5",i >> 5);
        printBinaryInt("(~i) >> 5",(~i) >> 5);
        printBinaryInt("i >>> 5",i >>> 5);
        printBinaryInt("(~i) >>> 5",(~i) >>> 5);

        long l = 2L;
        long m = 3L;
        printBinaryLong("-1L",-1L);
        printBinaryLong("+1L",+1L);
        long ll = 9223372036854775807L;
        printBinaryLong("Max positive",ll);
        long lln = -9223372036854775807L;
        printBinaryLong("Max negative",lln);
        printBinaryLong("l",l);
        printBinaryLong("~l",~l);
        printBinaryLong("-l",-l);
        printBinaryLong("m",m);
        printBinaryLong("l & m",l & m);
        printBinaryLong("l | m",l | m);
        printBinaryLong("l ^ m",l ^ m);
        printBinaryLong("l << 5",l << 5);
        printBinaryLong("l >> 5",l >> 5);
        printBinaryLong("(~l) >> 5",(~l) >> 5);
        printBinaryLong("l >>> 5",l >>> 5);
        printBinaryLong("(~l) >>> 5",(~l) >>> 5);

    }

    static void printBinaryInt(String s , int i){
        System.out.println(s + ", int: " + i + ", binary:\n " + Integer.toBinaryString(i) );
    }
    static void printBinaryLong(String s , long l){
        System.out.println(s + ", long: " + l + ", binary:\n " + Long.toBinaryString(l) );

    }

}
