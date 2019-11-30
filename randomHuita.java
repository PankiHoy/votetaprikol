import java.util.Arrays;
import java.util.Collections;

public class RandomNumbers {
    public static void main(String[] args) {
        Integer mas[] = new Integer[10];
        for (int i = 0; i < 10; i++) {
            mas[i] = getRandomIntegerBetweenRange(0, 10);
        }
        Arrays.sort(mas, 0, 10);
        System.out.println(Arrays.toString(mas));
        Arrays.sort(mas, Collections.reverseOrder());
        System.out.println(Arrays.toString(mas));
    }

    public static int getRandomIntegerBetweenRange(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}
