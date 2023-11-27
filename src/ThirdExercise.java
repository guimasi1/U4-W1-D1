import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire la lunghezza del lato.");
        double side1 = scanner.nextDouble();
        System.out.println("Inserire la lunghezza dell'altro lato.");
        double side2 = scanner.nextDouble();
        System.out.println(perimeter(side1, side2));
        System.out.println("Inserire il numero di cui si vuole sapere se è pari o dispari.");
        byte numToTest = scanner.nextByte();
        System.out.println(oddOrEven(numToTest));
        System.out.println("Inserire in sequenza la lunghezza dei 3 lati del triangolo.");
        double triangleSide1 = scanner.nextDouble();
        double triangleSide2 = scanner.nextDouble();
        double triangleSide3 = scanner.nextDouble();
        System.out.println(trianglePerimeter(triangleSide1, triangleSide2, triangleSide3));
    }

    public static double perimeter(double num1, double num2) {
        double side1 = num1 * 2;
        double side2 = num2 * 2;
        return side1 + side2;
    }

    public static byte oddOrEven(int num) {
        if (num % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double trianglePerimeter(double a, double b, double c) {
        double semiperemeter = (a + b + c) / 2;
        double squareRoot = Math.sqrt(semiperemeter * (semiperemeter - a) * (semiperemeter - b) * (semiperemeter - c));
        return squareRoot;
    }


}
