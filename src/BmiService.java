public class BmiService {

    public double calculate(double weight, double growth) {

        double index;
        index = weight / (growth * growth);

        return index;
    }
}
