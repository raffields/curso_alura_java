public class Conditional {
    public static void main(String[] args) {
        int releaseDate = 2022;
        boolean isIncluded = false;
        double rating = 8.1;
        String planType = "plus";

        if (releaseDate >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (isIncluded || planType.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
