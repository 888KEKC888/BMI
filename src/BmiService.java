public class BmiService {
    public long bodyMassIndex(double height, long weight) {
        double result;
        double index = height * height;
        //double extent = 2;
        //double index = Math.pow(height, extent);

        result = weight / index;

        return (long) result;
    }
}
