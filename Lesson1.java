import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        // task1();
        // task2();
        // task3();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        LocalTime lt = LocalTime.now();
        String start = "";
        if (lt.isAfter(LocalTime.parse("05:00:00")) && lt.isBefore(LocalTime.parse("11:59:59"))) {
            start = "Доброе утро, ";
        } else if (lt.isAfter(LocalTime.parse("12:00:00")) && lt.isBefore(LocalTime.parse("17:59:59"))) {
            start = "Добрый день, ";
        } else if (lt.isAfter(LocalTime.parse("18:00:00")) && lt.isBefore(LocalTime.parse("22:59:59"))) {
            start = "Добрый вечер, ";
        } else if (lt.isAfter(LocalTime.parse("23:00:00")) && lt.isBefore(LocalTime.parse("04:59:59"))) {
            start = "Доброй ночи, ";
        }
        System.out.println(start + name);
    }

    public static void task2() {
        int[] val = new int[] {1,1,0,1,1,1};
        int counter = 0;
        int max = 0;
        for (int i = 0; i < val.length; i++) {
            int curr = val[i];
            if (curr == 1) {
                counter += 1;
            } else {
                counter = 0;
            }
            if (counter > max) {
                max = counter;
            }
        }
        System.out.println(max);
    }

    public static void task3() {
        int[] nums = new int[] {3,2,2,3};
        int val = 3;
        int counter = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (curr != val) {
                res.add(curr);
            } else {
                counter += 1;
            }
        }

        for (int i = 0; i < counter; i++) {
            res.add(val);
        }
        System.out.println(res);
    }

    public static void task4() {

    }

    public static void task5() {

    }
}
