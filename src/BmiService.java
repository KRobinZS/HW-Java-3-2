public class BmiService {
    public int calculate(double m, double kg) {
        int index;
            index = (int) (kg / (m * m));
        return index;
    }
}
