public class BabochkaTupa {
    public static void main(String[] args) {
        int mas[][]=new int[5][5];
        int i,j;
        for (i=0;i<mas.length/2+1;i++){
            for (j=0;j<mas[i].length;j++){
                if ((j<i) || (j>=(mas[i].length-i))) {
                    mas[i][j] = 0;
                }
                else {
                    mas[i][j] = 1;
                }
            }
        }
        for (i=mas.length-1; i>=mas.length/2+1; i--){
            for (j=0; j<mas[i].length; j++){
                if ((j<(mas[i].length-1-i)) || (j>i)) {
                    mas[i][j] = 0;
                }
                else {
                    mas[i][j] = 1;
                }
            }
        }
        for (i=0;i<mas.length;i++){
            for(j=0;j<mas[i].length;j++){
               System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
