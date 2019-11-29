import java.util.Arrays;

public class StudentikiGrizutGranitNauki {
    public static void main(String[] args) {
        int mas[];
        mas = new int[13];
        int max= mas[0];
        for (int i = 0; i < 13; i++) {
            mas[i] = getRandomIntegerBetweenRange(0, 10);
        }
        System.out.println(Arrays.toString(mas));
        for (int i = 1; i< 13; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        for (int i=0; i<13; i++) {
            if (max == mas[i]) {
                System.out.print(mas[i] + "-");
                System.out.println(i);
            }
        }
    }

    public static int getRandomIntegerBetweenRange(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}
