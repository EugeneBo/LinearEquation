package homework.equations;

import java.util.Scanner;

public class Equations {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("You are going to solve linear equation of type: \"kx+b=y\". \nEnter your coefficients:");

        System.out.print("k=");
        double k = sc.nextDouble();

        System.out.print("b=");
        double b = sc.nextDouble();

        System.out.print("y=");
        double y = sc.nextDouble();


        if (k != 0) {

            System.out.print("\nYou equation is: ");
            System.out.printf("%fx%+f", k, b);
            System.out.println("=" + y);

            System.out.println("\nx=" + ((y - b) / k));

        } else {
            System.out.println("\nNo root! k=0");
        }

    }


}
