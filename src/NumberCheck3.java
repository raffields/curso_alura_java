import java.util.Scanner;

public class NumberCheck3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("O número " + number + " é par");
        } else {
            System.out.println("O número " + number + " é ímpar");
        }
    }
}
