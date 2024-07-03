//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 1.87;
        double kg = 98;
        int index = service.calculate(m, kg);
        System.out.println("Имт=" + index);
    }
}