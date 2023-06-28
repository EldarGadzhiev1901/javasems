import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.logging.Logger;

public class task3 {

   public static void calc(String[] args) throws IOException {
      FileWriter fileWriter = new FileWriter("log.txt");
      System.out.println("Введите первое число ");
      Logger logger1 = Logger.getAnonymousLogger();
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
      int cmd = inputRead.nextInt();
      int sum;

      switch (cmd) {
         case 1:
            sum = n1 + n2;
            System.out.println(sum);
            logger1.info("Сумма");
             fileWriter.write(String.valueOf("Сумма " + LocalDateTime.now()));

            break;

         case 2:
            sum = n1 - n2;
            System.out.println(sum);
            logger1.info("Разница");
            fileWriter.write(String.valueOf("Разница " + LocalDateTime.now()));
            break;

         case 3:
            sum = n1 * n2;
            System.out.println(sum);
            
            logger1.info("Произведение ");
            fileWriter.write(String.valueOf("Произведение " + LocalDateTime.now()));

            break;
         case 4:
            sum = n1 / n2;
            System.out.println(sum);
            logger1.info("Частное");
            fileWriter.write(String.valueOf("Частное " + LocalDateTime.now()));
            break;
         default:
            System.out.println("Неверная команда");
            logger1.info("Ошибка ");
            fileWriter.write(String.valueOf("Ошибка " + LocalDateTime.now()));

      }
fileWriter.close();
   }
}
