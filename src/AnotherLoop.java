import java.util.Scanner;

public class AnotherLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rating = 0.0;
        double avgRating = 0.0;
        int iterations = 0;

        while (rating != -1) {
            System.out.println("Diga a sua avaliação para o filme:");
            rating = input.nextDouble();

            if (rating != -1) {
                avgRating += rating;
                iterations++;
            }
        }

        System.out.println("Média de avaliações: " + avgRating / iterations);
    }
}
