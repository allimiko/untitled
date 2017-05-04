package Lesson4;

import java.util.Random;

/**
 * Created by Monsters on 17.04.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        int a = 0;
        int[] mas = new int[15];
        for (int i = 0; i < mas.length; i++)
        {
            Random rnd = new Random();
            mas[i]=rnd.nextInt(10);
            System.out.print(mas[i] + " ");
            if(mas[i]>0 & mas[i]%2==0)
                a++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве " + a + " четных");
    }
}
