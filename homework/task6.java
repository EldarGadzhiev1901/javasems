import java.util.ArrayDeque;
import java.util.Deque;

public class task6 {
    public static void main(String[] args) {
        ArrayDeque<Integer> arr = new ArrayDeque<Integer>();
        int a = (int) (Math.random() * 0 - 10);
        int b = (int) (Math.random() * 20 - 10);
        int c = (int) (Math.random() * -10 );
        int d = (int) (Math.random() * 20 -10 );
        int e = (int) (Math.random() * 20 - 10);
        int f = (int) (Math.random() * 20 - 10);
        arr.add(a);
        arr.addFirst(b);
        arr.push(c);
        arr.addLast(d);
        arr.add(e);
        arr.add(f);
        System.out.print("Before: ");
        System.out.println(arr);
        int n1 = arr.peek();
        System.out.print("First num is: ");
        System.out.println(n1);
        int n2 = arr.getLast();
     System.out.print("Second num is: ");
        System.out.println(n2);
        int sum = n1 + n2;
        int mul = n1 * n2;
        arr.push(sum);
        arr.addLast(mul);
        System.out.print("After: ");
        System.out.println(arr);

    }
}
