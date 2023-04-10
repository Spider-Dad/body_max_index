//
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = (int) service.calculate(98, 1.87);
        System.out.println(index);

        System.out.println();
        System.out.println("Расчёт BMI индекса при разных параметрах:");

        System.out.println();
        System.out.println("Вес 100 кг, рост 1.75 м");
        System.out.println(service.calculate(100.00, 1.75));

        System.out.println();
        System.out.println("Вес 75 кг, рост 1.95 м");
        System.out.println(service.calculate(75.00, 1.95));

        System.out.println();
        System.out.println("Вес 65.6 кг, рост 1.56 м");
        System.out.println(service.calculate(65.60, 1.56));




    }
}