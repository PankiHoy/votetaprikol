public class arithmetic {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        double sa;
        while (Chislo.getRandomNumber() != 0) {
            sum+=Chislo.getRandomNumber();
            count++;
        }
        sa = sum / count;
        System.out.println(sa);
    }
}

class Chislo {
    public static double getRandomNumber() {
        double x = Math.random();
        return x;
    }
}