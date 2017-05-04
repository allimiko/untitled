package Lesson4;

/**
 * Created by Monsters on 04.04.2017.
 */
public class Task1 {
    public static void main(String[] args){
        int a=0;
      for(int i=1;i<=99;i++){
         if(i%2!=0)
               a++;
     }
        System.out.println(a);

        int[] mas = new int[a];

        for(int i=1,b=0;i<=99; i++){
            if(i%2!=0){
                mas[b]=i;
                System.out.print(mas[b]+" ");
                b++;
            }
        }
        System.out.println(" ");
        for(int i=mas.length-1;i>=0;i--){
            System.out.print(mas[i]+" ");

        }
    }
}
