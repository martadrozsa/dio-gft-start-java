import java.util.Locale;
import java.util.Scanner;

public class Experiences {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("How many test cases will you enter? ");
        int n = input.nextInt();
        System.out.println();

        char typeSubjects = '\n';
        int subjectsNumber = 0;
        int typeRabbit = 0;
        int typeMouse = 0;
        int typeFrog = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Number of research subjects: ");
            subjectsNumber = input.nextInt();
            System.out.print("Type of research subjects: ");
            typeSubjects = input.next().charAt(0);

            if (typeSubjects == 'C' || typeSubjects == 'c') {
                typeRabbit = typeRabbit + subjectsNumber;
            }
            else if (typeSubjects == 'R'|| typeSubjects == 'r') {
                typeMouse = typeMouse + subjectsNumber;
            }
            else if (typeSubjects == 'S'|| typeSubjects == 's') {
                typeFrog = typeFrog + subjectsNumber;
            }
        }

        int totalSubjects = typeRabbit + typeMouse + typeFrog;
        double percentageRabbit = ((double)typeRabbit / totalSubjects) * 100;
        double percentageMouse = ((double)typeMouse / totalSubjects) * 100;
        double percentageFrog = ((double)typeFrog/ totalSubjects) * 100;


        System.out.printf("Total: %d cobaias\n", totalSubjects);
        System.out.printf("Total de coelhos: %d\n", typeRabbit);
        System.out.printf("Total de ratos: %d\n", typeMouse);
        System.out.printf("Total de sapos: %d\n", typeFrog);
        System.out.printf("Percentual de coelhos: %.2f%%\n", percentageRabbit);
        System.out.printf("Percentual de ratos: %.2f%%\n", percentageMouse);
        System.out.printf("Percentual de sapos: %.2f%%\n", percentageFrog);

        input.close();

    }
}
