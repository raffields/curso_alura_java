public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int releaseDate = 2022;
        System.out.println("Ano de lançamento: " + releaseDate);
        boolean isIncluded = true;
        double rating = 8.1;

        double avgRating = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(avgRating);

        String name = "Top Gun: Maverick";
        String synopsis;
        synopsis = """
                   Filme: Top Gun
                   Filme de aventura com galã dos anos 80.
                   Muito bom!
                   Ano de lançamento
                """ + releaseDate;
        System.out.println(synopsis);

        int stars = (int) (avgRating / 2);
        System.out.println(stars);
    }
}