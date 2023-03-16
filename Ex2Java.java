import java.util.Scanner;

public class Ex2Java {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double temp = sc.nextDouble();
        double f = 32;
        double conve = temp*1.8+f;
        System.out.printf("A temperatura em Fahrenheit é: %.1f%n",conve);
    }
}
