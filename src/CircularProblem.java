public class CircularProblem {
    public CircularProblem() {}
    public static int circular(int n) {

        int power2 = 1;
        while (power2 <= n) {
            power2 = power2 * 2;
        }
        power2 = power2 / 2;
        return  (n - power2) * 2 + 1;
    }

}
