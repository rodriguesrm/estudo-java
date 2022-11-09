package exercicios.listas;

import entities.Emplyoee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpStore {

    // region Local methods

    private static void include(List<Emplyoee> emplyoeeList) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("+----------------------------------------------------------------------------+");

            System.out.printf("%nId.......: ");
            int id = sc.nextInt();

            System.out.printf("%nNome.....: ");
            String name = sc.nextLine();

            System.out.printf("%nSalário..: ");
            if (sc.hasNextLine())
                sc.nextLine();
            double salary = sc.nextDouble();

            if (emplyoeeList.stream().filter(x -> x.getId() == id).findAny().isEmpty())
                emplyoeeList.add(new Emplyoee(id, name, salary));
            System.out.println("Id já cadastrado");


        }

    }

    // endregion

    // region Public methods

    /** Método principal para chamada */
    public static void open() {

        boolean doContinue;
        List<Emplyoee> emplyoees = new ArrayList<Emplyoee>();

        do {

            doContinue = true;

            System.out.println("+----------------------------------------------------------------------------+");
            System.out.println("| ESCOLHA UMA OPCAO                                                          |");
            System.out.println("+----------------------------------------------------------------------------+");
            System.out.println("| 1 - Cadastrar                                                              |");
            System.out.println("| 2 - Consultar                                                              |");
            System.out.println("| 3 - Relatorio                                                              |");
            System.out.println("| 0 - SAIR                                                                   |");
            System.out.println("+----------------------------------------------------------------------------+");

            int menuChoice;
            try (Scanner sc = new Scanner(System.in)) {
                menuChoice = sc.nextInt();
            }

            switch (menuChoice) {
                case 1:
                    include(emplyoees);
                    break;
                default:
                    doContinue = false;
            }

        } while (doContinue);

        System.out.println("FIM DO PROGRAMA");

    }

    // endregion

}
