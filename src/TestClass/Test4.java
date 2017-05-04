package TestClass;

/**
 Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
 Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
 */
public class Test4 {
    public static void main(String[] args) {
        int[] mas = new int[8];// c маленькой буквы названия переменных//
        for(int i=0;i<mas.length;i++){
            mas[i]=(int)(Math.random()*9+1);// рандом то 1 до 9 ?
            System.out.print(mas[i] +" ");
        }
  // переход на новую строку, где?
        for(int i=0;i<mas.length;i++){
            if(mas[i]%2!=0){
                mas[i]=0;
            }
            System.out.println(mas[i] +"");// пробел между числами? вывести в строку
        }
    }
}
