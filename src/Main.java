public class Main {

    public static void main(String[] args) {

        double m = 60.0;
        double h = 1.76;

        BmiService service = new BmiService();
        double bmi = service.calculate(m, h);

        System.out.printf("%.1f", bmi);

    }
}
