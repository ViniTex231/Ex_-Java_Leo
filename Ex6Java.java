import java.util.Scanner;

public class Ex6Java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de 'A': ");
        double eqa = sc.nextDouble();

        System.out.println("Digite o valor de 'B': ");
        double eqb = sc.nextDouble();

        System.out.println("Digite o valor de 'C': ");
        double eqc = sc.nextDouble();

        double equa1 = 4*eqa*eqc;
        double equa2 = (eqb*eqb) - equa1;
        System.out.println(equa2);
    }
}