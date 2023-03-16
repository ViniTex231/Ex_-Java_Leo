import java.util.Scanner;

public class Ex4Java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();

        double quadrado;
        quadrado = Math.pow(valor, 2);

        double cubo;
        cubo = Math.pow(valor, 3);

        System.out.println("O valor do quadrado é: "+quadrado);
        System.out.println("O valor ao cubo é: "+cubo);
    }
}