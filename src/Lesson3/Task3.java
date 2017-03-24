package Lesson3;

/**
 * Created by Monsters on 21.03.2017.
 */
public class Task3 {

    public static void main(String[] args) {
        int a =0;
        int b;
        int c = 0;
        while (a < 100){
            b = c;
            a = a + 2;
            c = a + b;
            System.out.println(c);
        }
        System.out.println("------------");
        System.out.println(c);
    }

}
