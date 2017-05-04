package Lesson4;

import java.util.Scanner;

/**
  Created by Monsters on 18.04.2017.

    Выясните экспериментальном путём, начиная с какого элемента последовательности Фибоначчи,
    вычисление с использованием рекурсии становится неприемлемым (занимает более минуты по времени).
    Использовать для замера времени System.currentTimeMillis() который возвращает время в миллисекундах)
 */
public class Task5 {
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();
        int a = 1;
        int b = 1;
        int n;
        int sum_fib;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i = 0; i < n; i++){
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            long endTime = System.currentTimeMillis();
            long diff = endTime - startTime;
            System.out.print(sum_fib + " ");
            System.out.println(diff);

        }
    }


}
