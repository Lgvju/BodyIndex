public class BmiService {
    public int calculate(double meters, double kilogram) {
        double bmi = kilogram / (meters * meters);
        return (int) bmi;
    }
}
