package etapa.basica;

import java.util.Scanner;

public class EstruturasCondicionais {

    public static void atividade() {
        diaDaSemana();
    }

    private static void diaDaSemana() {

        try(Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe o número do dia (1-7): ");
            int numeroDia = sc.nextInt();

            String nomeDia;
            switch (numeroDia) {
                case 1:
                    nomeDia = "domingo";
                    break;
                case 2:
                    nomeDia = "segunda";
                    break;
                case 3:
                    nomeDia = "terça";
                    break;
                case 4:
                    nomeDia = "quarta";
                    break;
                case 5:
                    nomeDia = "quinta";
                    break;
                case 6:
                    nomeDia = "sexta";
                    break;
                case 7:
                    nomeDia = "sábado";
                    break;
                default:
                    nomeDia = "Dia inválido";

            }

            System.out.println(nomeDia);

        }

    }

}
