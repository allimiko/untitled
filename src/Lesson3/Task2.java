package Lesson3;

import java.util.Scanner;

/**
 * Created by Monsters on 20.03.2017.
 */
public class Task2 {

  static   int n;
    static int m;
    static int a=10;

    static int s;
    static int t;

    public static void check(){
        if(s>t){
            System.out.println(n + " бдиже к 10");
        }else {
            System.out.println(m + " бдиже к 10");
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        do{
            if(n<0){
                System.out.println("Это число меньше 0, введите друго число");
            }
            System.out.print("Введите первое число: ");
            n = in.nextInt();
        }
        while (n<0);



        System.out.print("Введите второе число: ");
        m = in.nextInt();

      if(m>a && n>a){
         s = m-a;
         t = n-a;
       check();
      }

      if(m<a && n>a){
          s = a-m;
          t = n-a;
         check();
      }

      if(m<a && n<a){
          s = a-m;
          t = a-n;
          check();
      }

        if(m>a && n<a){
            s = m-a;
            t = n-a;
            check();
        }
    }
}


