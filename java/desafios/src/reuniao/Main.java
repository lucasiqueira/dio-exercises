package reuniao;

import java.util.List;
import java.util.Scanner;
import java.text.ParseException;


public class Main {

    public static void main(String[] args) {
        // Lê os dados de Entrada conforme descrito neste Desafio.
        Scanner scanner = new Scanner(System.in);
        String dataInicial = scanner.nextLine();
        String dataFinal = scanner.nextLine();

        SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
        List<String> analises = null;
        try {
            analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial,
                dataFinal);
        } catch (ParseException e) {
            System.out.println("Erro ao converter data");
        }

        for (String analise : analises) {
            System.out.println(analise);
        }
    }
}
