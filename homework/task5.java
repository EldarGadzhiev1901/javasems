// Задание

// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
import java.util.Collections;   
import java.util.ArrayList;



public class task5 {

    public static void main(String[] args) {
           ArrayList<Integer> lst = new ArrayList<Integer>();
           int a = (int) ( Math.random() * 20 - 10 );
           int b = (int) ( Math.random() * 20 - 10 );
           int c = (int) ( Math.random() * 20 - 10 );
           int d = (int) ( Math.random() * 20 - 10 );
           int e = (int) ( Math.random() * 20 - 10 );
           int f = (int) ( Math.random() * 20 - 10 );
            lst.add(a);
            lst.add(b);
            lst.add(c);
            lst.add(d);
            lst.add(e);
            lst.add(f);
            System.out.print("Original ");
            System.out.println(lst);
            // System.out.println();
            double avg = 0;
            System.out.print("Min num in collection ");
            System.out.println(Collections.min(lst));
            // System.out.println();
            System.out.print("Max num in collection ");
            System.out.println(Collections.max(lst));
            for (int j = 0; j < lst.size(); j++) {
                avg = avg + lst.get(j);
            }
            System.out.print("Avg value of nums ");
            System.out.println(avg / lst.size());


        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) % 2 == 0){
                lst.remove(i);
                i--;
                
              
            }
            System.out.print("Even num removing");
            System.out.println(lst);
    }
    
}
}