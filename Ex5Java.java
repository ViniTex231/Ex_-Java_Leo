import java.util.Scanner;

public class Ex5Java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do triangulo: ");
        double base = sc.nextDouble();

        System.out.println("Digite a altura do triangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura / 2;
        System.out.println(area);

    }
}