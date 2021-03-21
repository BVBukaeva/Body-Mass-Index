public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight=55;
        double height=160;
        double index = service.calculate(weight, height);
        System.out.println(index);
    }
}
