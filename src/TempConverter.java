public class TempConverter {
    public static void main(String[] args) {
        double tempInC = 21.8;
        double tempInF = tempInC * 1.8 + 32;
        int simpleF = (int) tempInF;

        System.out.printf("%f em Celsius é igual a %f Fahrenheit%n", tempInC, tempInF);
        System.out.println("Ou em inteiros: " + simpleF);
    }
}
