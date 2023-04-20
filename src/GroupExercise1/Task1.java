package GroupExercise1;

public class Task1 {
    public static void main(String[] args) {

        int[] temperature = {79, 82, 93, 78, 80, 76, 83};

        int maxTemperature = temperature[0];
        int minTemperature = temperature[0];

        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] > maxTemperature) {
                maxTemperature = temperature[i];
            } else if (temperature[i] < minTemperature) {
                minTemperature = temperature[i];
            }
        }
        System.out.println("Highest temperature of the week is " + maxTemperature);
        System.out.println("Lowest temperature of the week is " + minTemperature);
    }
}
