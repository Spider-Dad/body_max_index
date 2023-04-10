public class BmiService {
    public double calculate(double weightKg, double heightMt) {
        int index = (int) (weightKg / Math.pow(heightMt,2));
        return index;
    }
}
