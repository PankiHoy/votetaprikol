import java.util.Arrays;

public class RandomNumbersArray {
    public static void main(String[] args) {
        int mas[];
        mas = new int[10];
        for (int i = 0; i < 10; i++) {
            mas[i] = getRandomIntegerBetweenRange(1, 100);
        }
        Arrays.sort(mas, 0, 10);
        System.out.println(Arrays.toString(mas));
    }

    public static int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}
