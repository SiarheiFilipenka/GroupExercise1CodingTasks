package GroupExercise1;

import java.util.Random;

public class Task8 {

    public static void main(String[] args) {

        int[][] arr2D = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("================================");
        int minValue = arr2D[0][0];
        int maxValue = arr2D[0][0];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] < minValue) {
                    minValue = arr2D[i][j];
                } else if (arr2D[i][j] > maxValue) {
                    maxValue = arr2D[i][j];
                }
            }
        }
        System.out.println("Min value is : " + minValue);
        System.out.println("Max value is : " + maxValue);
    }
}
