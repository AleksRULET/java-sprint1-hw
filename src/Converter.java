public class Converter {

    static double convertToKM (int steps) {
        double kilometers = steps * 0.00075;
        return kilometers;
    }

    static double convertToCalories(int steps) {
        double calories = steps * 0.050;
        return calories;
    }
}
