import java.util.Scanner;

public class NumberCheck2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int firstNumber = scanner.nextInt();
        System.out.println("Digite outro número:");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");

            if (firstNumber > secondNumber) {
                System.out.println("O primeiro número é maior que o segundo");
            } else {
                System.out.println("O primeiro número é menor que o segundo");
            }
        }

    }
}
