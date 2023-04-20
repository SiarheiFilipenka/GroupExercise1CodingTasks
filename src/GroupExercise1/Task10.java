package GroupExercise1;

public class Task10 {
    public static void main(String[] args) {

        String[] arr = {"String1", "Duplicate1", "String2", "Duplicate2", "String3", "Duplicate2", "String4", "Duplicate1", "String5", "String6",};

        System.out.println("Duplicates elements from an array are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].equals(arr[i]) && i != j) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
