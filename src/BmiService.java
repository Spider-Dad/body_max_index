public class BmiService {
    public double calculate(double weight, double height) {
        int index = (int) (weight / (height * height));
        return index;
    }
}
