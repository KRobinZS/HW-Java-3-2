public class BmiService {
    public double calculate(double m, double kg) {
        double result;
        {
            result = kg / (m * m);

        }
        return result;
    }
}
