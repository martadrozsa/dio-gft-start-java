import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double radius = scan.nextDouble();

        double area = 3.14159 * (Math.pow(radius,2));

        System.out.printf("A=%.4f\n", area);
    }
}
