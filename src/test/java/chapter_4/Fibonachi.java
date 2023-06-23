package chapter_4;

public class Fibonachi {
    static  int prev=0,mid=1,fib=0;

    public static void main(String[] args) {

//        int prev = 0, mid = 1, fib , i , count = 10;
//        System.out.print(prev+ " "+ mid);
//        for(i=2; i<count; ++i){
//            fib=prev+mid;
//            System.out.print(fib + " ");
//            prev = mid;
//            mid = fib;
//        }

        System.out.print(prev + " "+ mid + " ");
        fibN(5);
    }

    static void fibN(int value){
        if(value>0){
            fib=prev+mid;
            System.out.print(fib+ " ");
            prev = mid;
            mid = fib;
            fibN(value-1);
        }
    }


}
