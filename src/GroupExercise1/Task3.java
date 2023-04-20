package GroupExercise1;

public class Task3 {

    public static void main(String[] args) {

        int[][] numbers = {
                {10, 5, 4, 3},
                {15, 1, 6, 7},
                {12, 13, 2, 8}
        };

        System.out.println("Even numbers from the array are:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
