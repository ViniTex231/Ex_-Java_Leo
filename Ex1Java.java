import java.util.Scanner;

public class Ex1Java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temp = sc.nextDouble();
        double conve = (temp - 32) / 1.8;
        System.out.printf("A temperatura em Celsius é: %.1f%n",conve);
        sc.close();
    }
}

