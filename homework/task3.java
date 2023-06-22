import java.util.Scanner;
public class task3 {

 public static void main(String[] args) {
    System.out.println("Введите первое число ");
     Scanner inputRead = new Scanner(System.in);
     int n1 = inputRead.nextInt();
     System.out.println("Введите второе число ");
     int n2 = inputRead.nextInt();
     System.out.println(n1);
     System.out.println(n2);
     System.out.println("Введите команду калькулятора: ");
     System.out.println("Введите '1' для сложения ");
     System.out.println("Введите '2' для вычитания ");
     System.out.println("Введите '3' для уможения ");
     System.out.println("Введите '4' для деления ");
    int cmd =  inputRead.nextInt();
    int sum;


    switch (cmd) {
 case 1:
    sum = n1 + n2;
     System.out.println(sum);
 break;
 case 2:
 sum = n1 - n2;
  System.out.println(sum);
  break;
  case 3:
      sum = n1 * n2;
       System.out.println(sum);
        break;
  case 4:
  sum = n1 / n2;
   System.out.println(sum);
 default:
 System.out.println("Неверная команда");

 }


 }
}

