import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int param1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int param2 = terminal.nextInt();

        try {
            contar(param1, param2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro número deve ser menor que o segundo.");
        }
    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param1 > param2) {
            throw new ParametrosInvalidosException();
        }

        for (int i = param1; i <= param2; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
