package GroupExercise1;

public class Task5 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Array before swap:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        arr[1] = arr[1] + arr[3];
        arr[3] = arr[1] - arr[3];
        arr[1] = arr[1] - arr[3];

        System.out.println();
        System.out.println("Array after swap:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
