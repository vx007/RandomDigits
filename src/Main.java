import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(0, 1000));
        }
        System.out.println(list);
        list.removeIf(i -> i % 2 == 1);
        System.out.println(list);
    }
}
