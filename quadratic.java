import java.util.Scanner;

public class quadratic {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratic Equation Solver");
        System.out.println("Quadratic Equation Solver");
        System.out.println("Quadratic Equation Solver");


        // Input coefficients

        System.out.print("Enter Coefficient a = ");
        double a = scanner.nextDouble();


        System.out.print("Enter Coefficient b =");
        double b = scanner.nextDouble();


        System.out.print("Enter Coefficient c = ");
        double c = scanner.nextDouble();


        // Check if it s a valid quadratic equation

        if (a == 0) {
            System.out.println(" \n[!] 'a' cannot be 0. this is not a quadtatic equation.");

            scanner.close();
            return ;
        }

        // Calculate discriminant
        double discriminant = (b*b) - (4*a*c);

        System.out.println(" \n[!] 'a' cannot be 0. This is not a quadratic equation. ");
        System.out.printf("Disctiminant (D) = %.2f%n", discriminant );
        System.out.println("");
    }
}