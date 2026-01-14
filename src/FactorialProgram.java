import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = scanner.nextInt();
        long result = 1;

        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        System.out.println("O fatorial de " + number + " é: " + result);
    }
}
