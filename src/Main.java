public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        double height = 1.87; // meters
        long weight = 98; // kilograms
        long massIndex = calculate.bodyMassIndex(height, weight);
        System.out.println(massIndex);
    }
}