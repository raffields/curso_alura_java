import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int guess = 0;
        int maxGuesses = 5;
        int totalGuesses = 0;

        System.out.println("Adivinhe qual o número de 0 a 100:");

        while (totalGuesses < maxGuesses) {
            guess = scanner.nextInt();
            totalGuesses++;
            System.out.println("Seu palpite é: " + guess);

            if (randomNumber == guess) {
                System.out.println("Acertou! O número é " + randomNumber);
                break;
            } else if (randomNumber > guess) {
                System.out.println("Seu palpite é menor que o número.");
            } else {
                System.out.println("Seu palpite é maior que o número.");
            }

        }

        if (maxGuesses == totalGuesses && guess != randomNumber) {
            System.out.println("Infelizmente vc não acertou em 5 tentativas. O número era: " + randomNumber);
        }
    }
}
