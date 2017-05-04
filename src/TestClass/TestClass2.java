package TestClass;

import java.util.Scanner;

/**
 * Created by Monsters on 21.03.2017.
 */
public class TestClass2 {
    private static void ln(String a) {
        System.out.println(a);
    }
    static long fib (int n) {
        if (n==1 || n == 2) {
            return 1;
        }
        return fib (n-2) + fib (n-1);
    }
    private static long fibo(int n) {
//lim(fib(n)) = 47;
        if(n < 47) {
            long z = fib(n);
            return z;
        } else {
            long n1 = 1,n2 = 1,s=0;
            for(int i = 0; i<n; i++){
                if(i%2==0) {
                    s = n1+n2;
                    n1 = s;
                } else {
                    s = n1+n2;
                    n2 = s;
                }
            }
            return s;
        }
    }
    public static void main(String[] args) {
        int f = 9;
        long d = fibo(f);
        f = 4;
        long d1 = fibo(f);
        int k = (int)(d/d1);
        ln("Zadanije 1: Na 48 nomere secundomer pokazal 1:00.76 (1 minuta 0.76 sekund)");
        System.out.println("Zadanije 2: "+fibo(100));
        System.out.println("Zadanije 3: "+k+" raz");
    }
}