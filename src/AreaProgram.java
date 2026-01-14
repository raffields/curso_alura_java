import java.util.Scanner;

public class AreaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a opção: ");
        System.out.println("1 - Calcular área do quadrado");
        System.out.println("2 - Calcular área do círculo");

        int areaOption = scanner.nextInt();

        switch (areaOption) {
            case 1:
                System.out.println("Digite o tamanho de um dos lados do quadrado:");
                int sideLength = scanner.nextInt();

                System.out.println("A área do quadrado é: " + sideLength * sideLength);
                break;

            case 2:
                System.out.println("Digite o tamanho do raio do círculo:");
                int radiusLength = scanner.nextInt();

                System.out.println("A área do círculo é: " + Math.PI * radiusLength * radiusLength);
                break;

            default:
                System.out.println("As opções disponíveis sao 1 e 2");
                break;
        }
    }
}
