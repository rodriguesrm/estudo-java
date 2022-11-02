package etapa.basica;

import java.util.Scanner;

public class EstruturasDeRepeticao {

    public static void atividade() {
        somatoriaRepetitiva();
    }

    private static void somatoriaRepetitiva() {

        int total = 0;
        int entrada;

        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Informe os números para soma ou 0 (zero) para finalizar");
            do {
                entrada = sc.nextInt();
                total += entrada;
            } while (entrada != 0);

            System.out.printf("O valor da somatória é: %d", total);

        }

    }

}
