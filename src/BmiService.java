public class BmiService {
    public int bodyMassIndex(double height, int weight) {
        double result;
        double index = height * height;
        //double extent = 2;
        //double index = Math.pow(height, extent);

        result = weight / index;

        return (int) result;
    }
}
