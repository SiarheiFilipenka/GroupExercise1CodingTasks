package GroupExercise1;

public class Task4 {

    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 3, 4},
                {9, 10, 11, 12},
                {5, 6, 7, 8},
                {13, 14, 15, 16}
        };

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    evenSum += numbers[i][j];
                } else {
                    oddSum += numbers[i][j];
                }
            }
        }
        System.out.println("The sum of the even elements is " + evenSum);
        System.out.println("The sum of the odd elements is " + oddSum);
    }
}
