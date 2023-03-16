import java.util.Scanner;

public class Ex3Java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura (utilize ','): ");
        double altura = sc.nextDouble();
        altura=Math.pow(altura,2);

        System.out.println("Digite o peso: ");
        double peso = sc.nextDouble();

        double imc = peso/altura;
        if (imc < 18.5) {
            System.out.println("Abaixo do peso normal");
        }   else if (imc < 24.9){
            System.out.println("Peso normal");
        }   else if (imc < 29.9){
            System.out.println("Excesso de peso");
        }   else if (imc < 34.9){
            System.out.println("Obesidade classe I");
        }   else if (imc < 39.9){
            System.out.println("Obesidade clase II");
        }   else if (imc > 40){
            System.out.println("Obesidade classe III");
        }

    }
}