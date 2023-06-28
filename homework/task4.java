import java.util.Scanner;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;

public class task4 {
    private static Scanner scaner = new Scanner(System.in);
    private static Logger logger = Logger.getLogger(task4.class.getName());
    private static SimpleFormatter simple_formatter = new SimpleFormatter();
    public static void main(String[] args) {
        try {
            FileHandler fileH = new FileHandler("hw2.log", true);
            fileH.setFormatter(simple_formatter);
            logger.addHandler(fileH);
            bubble();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void bubble()  {

        int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2 };
        int temp;
        int count = 1;
        
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    isSorted = false;
                    temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                    // System.out.print(nums[i] + ",");
                    logger.info(Arrays.toString(nums) + " итерация " + count + "\n");
                    count++;

                    

                }
            }

        }
        for (int i = 0; i < nums.length; i++) {
            // System.out.print(nums[i] + " ");

        }
    }
}
