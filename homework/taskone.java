
// вычислиить n! (произведение чисел от 1 до n) 
import java.util.Scanner;

public class taskone {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner inputRead = new Scanner(System.in);
        int n = inputRead.nextInt();
        int sum = 1;
        for (int i = 1; i < n + 1; i++) {
            if (i <= n) {
                sum = sum * i;
            }
        }
        System.out.println(sum);
    }

}
