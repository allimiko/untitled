package Lesson3;

import java.util.Scanner;

/**
 * Created by Monsters on 21.03.2017.
 */
public class TestClass2 {
    public static void main(String args[]) {
        // prog — число созданное программой
        // user — число введённое пользователем
        int prog, user;
        int count = 0;
        // Генерируем случайное целое число от 1 до 10
        prog = (int) (Math.random() * 10) + 1;
        System.out.println("Я загадала число от 1 до 10, отгадайте его.");
        System.out.print("Вводите ваше число: ");
        Scanner input = new Scanner(System.in);
        // Проверяем, есть ли в потоке ввода целое число
        if (input.hasNextInt()) {
            do {
                count++;
                System.out.println("Попытка № " +count);
                // Читаем с потока ввода целое число
                user = input.nextInt();
                if (user == prog) {
                    System.out.println("Вы угадали!");
                } else {
                    // Проверяем, входит ли число в отрезок [1;10]
                    if (user > 0 && user <= 10) {
                        System.out.print("Вы не угадали! ");
                        // Если число загаданное программой меньше...
                        if (prog < user) {
                            System.out.println("Моё число меньше.");
                        } else {
                            System.out.println("Моё число больше.");
                        }
                    } else {
                        System.out.println("Ваше число вообще не из нужного отрезка!");
                    }
                }
            } while (user != prog);
        } else {
            System.out.println("Ошибка. Вы не ввели целое число!");

        }
        System.out.println( "Вы сделали "+count+ " попыток");
        System.out.println("До свиданья!");

    }
}