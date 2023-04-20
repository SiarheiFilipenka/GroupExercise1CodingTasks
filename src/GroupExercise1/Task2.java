package GroupExercise1;

public class Task2 {

    public static void main(String[] args) {

        int[] arr = {2, 6, 55, -20, 17};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of the array elements is " + sum);
    }
}
