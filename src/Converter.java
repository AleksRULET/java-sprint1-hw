public class Converter {

    double convertToKM (int steps) {
        double kilometers = steps * 0.00075;
        return kilometers;
    }

    double convertToCalories(int steps) {
        double calories = steps * 0.050;
        return calories;
    }
}
