package GroupExercise1;

public class Task7 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        System.out.println("First 10 numbers of Fibonacci series:");

        for (int i = 0; i < arr.length; i++) {
            if (i < 2) {
                arr[i] = i;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.print(arr[i] + " ");
        }
    }
}
