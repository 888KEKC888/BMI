public class BmiService {
    public long bodyMassIndex(double a, long b) {
        double result;
        double index = a*a; //exponentiation
        //double a1 = 2; //extent
        //double index = Math.pow(a, a1); //exponentiation

        result = b / index; //body mass index formula

        return (long) result;
    }
}
