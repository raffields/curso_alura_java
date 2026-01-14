public class CastingLesson {
    public static void main(String[] args) {
        double grade1 = 7.8;
        double grade2 = 8.9;
        double avgGrade = (grade1 + grade2) / 2;

        System.out.printf("A média das notas %.1f e %.1f é: %.1f", grade1, grade2, avgGrade);
        System.out.println();

        double test1 = 9.8;
        int intTest = (int) test1;
        System.out.println("Teste de double pra int: " + intTest);

        char text1 = 'a';
        String text2 = "Manuel";
        System.out.printf("Era %s ou %s?", text2, text2 + text1);
        System.out.println();

        double productPrice = 4.5;
        int quantity = 2;
        System.out.printf("%d produtos a %.2f dá o total de %.2f", quantity, productPrice,
                quantity * productPrice);
        System.out.println();

        double amountInUSD = 25.0;
        double oneBrlToUsdFxRate = 4.94;
        double amountInBRL = amountInUSD * oneBrlToUsdFxRate;
        System.out.printf("U$%.2f é igual a R$%.2f", amountInUSD, amountInBRL);
        System.out.println();

        double originalPrice = 12.50;
        int discount = 10;
        double finalPrice = originalPrice - (originalPrice * 10 / 100);
        System.out.printf("""
                Preço: R$%.2f
                Desconto: %d%%
                Preço final: R$%.2f
                """, originalPrice, discount, finalPrice);
        System.out.println();
    }
}
