public class random_numbers {
    public static void main(String[] args) {
        final int size = 1000;
        int count=0;
        double sum=0;
        int[] mass = new int[size];
        for (int i = 0; i < size; i++) {
            int value =(int)(Math.random() * 100);
            mass[i] = value;
            count++;
            if (value == 0) {
                break;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(mass[i] + " ");

        }
        System.out.println();
        for(int i=0;i<count;i++){
            sum+=mass[i];
        }
        System.out.println("среднее арифметическое:"+sum/(count-1));
    }
    }