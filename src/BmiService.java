public class BmiService {
    public double calculate(double weightKg, double heightMt) {
        int index = (int) (weightKg / (heightMt * heightMt));
        return index;
    }
}
