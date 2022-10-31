import java.util.Scanner;
public class CircularProblemRunner {
    public static void main(String[] args) {

        CircularProblem num = new CircularProblem();
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Circular Problem Solver!");
        System.out.print("How many numbers are in the circle: ");
        int n = s.nextInt();
        int solution = num.circular(n);
        System.out.println("The last remaining number is: " + solution);
    }
}

