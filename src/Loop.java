import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rating = 0.0;
        double avgRating = 0.0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga a sua avaliação para o filme:");
             rating = input.nextDouble();
             avgRating += rating;
        }

        System.out.println("Média de avaliações: " + avgRating / 3);
    }
}
