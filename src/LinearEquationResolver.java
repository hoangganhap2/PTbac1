import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("LinearEquationResolver");
        System.out.println("Given a equation as 'a*x+b=0',please enter constants: ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("a: ");
        double a= scanner.nextDouble();
        System.out.println("b: ");
        double b=scanner.nextDouble();
        System.out.println("c: ");
        double c=scanner.nextDouble();

        if(a !=0){
            double answer=(c-b)/a;
            System.out.printf("Equation pass with x = %f!\n",answer);
        }else {
            if(b==0){
                System.out.println("The solution is all x!");
            }else {
                System.out.println("No solution");

            }
        }

    }
}
