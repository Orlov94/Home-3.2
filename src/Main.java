public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bodyMassIndex = service.calculate(90.00F, 1.82F);
        System.out.println("Ваш индекс массы тела " + bodyMassIndex);
    }
}
