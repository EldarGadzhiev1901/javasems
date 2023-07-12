import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;

public class finaltask {
    static int id = 1;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Notebook nb1 = new Notebook(id, "Pink", "Windows", 16, 500, 16);
        id++;

        Notebook nb2 = new Notebook(id, "Violet", "MacOS", 32, 1000, 19);
        id++;

        Notebook nb3 = new Notebook(id, "Gray", "FreeDOS", 8, 256, 15);
        id++;

        Notebook nb4 = new Notebook(id, "White", "Ubuntu", 4, 128, 13);
        id++;

        Notebook nb5 = new Notebook(id, "White", "Windows", 6, 512, 20);
        id++;

        Set<Notebook> nbs = new HashSet<>(Arrays.asList(nb1, nb2, nb3, nb4, nb5));
        System.out.println("Введите номер параметра для фильтрации:");
        System.out.println("1 - по цвету");
        System.out.println("2 - по ОС");
        System.out.println("3 - по объёму RAM");
        System.out.println("4 - по объёму HDD");

        System.out.print("Введите параметр: ");
        String param = input.nextLine();

        Set<Notebook> fnbs = filter(param, nbs);
        if (fnbs != null) {
            for (Notebook nb : fnbs) {
                System.out.println(nb + "\n");
            }
        }
    }

    public static Set<Notebook> filter(String param, Set<Notebook> nbs) {
        Set<Notebook> fnbs = new HashSet<>();
        int min, max;
        switch (param) {

            case "1":
                System.out.print("Введите цвет: ");
                String color = input.nextLine().toLowerCase();
                for (Notebook nb : nbs) {
                    if (nb.color.toLowerCase().equals(color)) {
                        fnbs.add(nb);
                    }
                }
                break;

            case "2":
                System.out.println("Введите диапазон [min, max]:");
                System.out.print("min: ");
                min = Integer.parseInt(input.nextLine());
                System.out.print("max: ");
                max = Integer.parseInt(input.nextLine());

                for (Notebook nb : nbs) {
                    if (min <= nb.RAMSize && nb.RAMSize <= max) {
                        fnbs.add(nb);
                    }
                }
                break;

            case "3":
                System.out.println("Введите диапазон [min, max]:");
                System.out.print("min: ");
                min = Integer.parseInt(input.nextLine());
                System.out.print("max: ");
                max = Integer.parseInt(input.nextLine());

                for (Notebook nb : nbs) {
                    if (min <= nb.HDDSize && nb.HDDSize <= max) {
                        fnbs.add(nb);
                    }
                }
                break;
            default:
                System.out.println("Неверный параметр");
                return null;
        }
        return fnbs;

    }

}
