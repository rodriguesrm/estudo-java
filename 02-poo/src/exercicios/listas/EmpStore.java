package exercicios.listas;

import entities.Emplyoee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmpStore {

    // region Local methods

    private static void waitToEnter(Scanner sc) {
        System.out.print("Pressione <ENTER> tecla para continuar...");
        clearBuffer(sc);
        sc.nextLine();
    }

    private static void seedData(List<Emplyoee> emplyoeeList) {
        emplyoeeList.add(new Emplyoee(1, "RODRIGO", 16778.67));
        emplyoeeList.add(new Emplyoee(2, "LUCIENE", 1300.00));
        emplyoeeList.add(new Emplyoee(3, "AMANDA", 1800.00));
        emplyoeeList.add(new Emplyoee(4, "TIAGO", 1800.00));
    }

    private static void clearBuffer(Scanner sc) {
        if (sc.hasNextLine())
            sc.nextLine();
    }

    private static void printEmploye(Emplyoee emplyoee) {
        System.out.print("Id.......: ");
        System.out.println(emplyoee.getId());

        System.out.print("Nome.....: ");
        System.out.println(emplyoee.getName());

        System.out.print("Salário..: ");
        System.out.printf("%n%.2f%n%n", emplyoee.getSalary());
    }

    private static void listaAll(Scanner sc, List<Emplyoee> emplyoeeList) {
        for (Emplyoee emplyoee : emplyoeeList) {
            System.out.println("------------------------------------------------------------------------------");
            printEmploye(emplyoee);
        }
        waitToEnter(sc);
    }

    private static void include(Scanner sc, List<Emplyoee> emplyoeeList) {

        System.out.print("+----------------------------------------------------------------------------+");

        System.out.printf("%nId.......: ");
        int id = sc.nextInt();

        System.out.printf("Nome.....: ");
        clearBuffer(sc);
        String name = sc.nextLine();

        System.out.printf("Salário..: ");
        double salary = sc.nextDouble();

        if (emplyoeeList.stream().filter(x -> x.getId() == id).findAny().isEmpty())
            emplyoeeList.add(new Emplyoee(id, name, salary));
        else
            System.out.println("Id já cadastrado");

    }

    private static void locate(Scanner sc, List<Emplyoee> emplyoeeList) {

        System.out.print("+----------------------------------------------------------------------------+");

        System.out.printf("%nInforme um Id para buscar: ");
        int id = sc.nextInt();

        Emplyoee emplyoee = emplyoeeList
                .stream()
                .filter(x -> x.getId() == id)
                .findAny()
                .orElse(null);

        if (emplyoee == null) {
            System.out.println("Registro não encontrado");
        } else {

            printEmploye(emplyoee);
            waitToEnter(sc);

            System.out.printf("%n%n");
        }

    }

    // endregion

    // region Public methods

    /** Método principal para chamada */
    public static void open() {

        Locale.setDefault(Locale.US);
        boolean doContinue;
        List<Emplyoee> emplyoees = new ArrayList<Emplyoee>();

        seedData(emplyoees);

        try (Scanner sc = new Scanner(System.in)) {
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

                menuChoice = sc.nextInt();

                switch (menuChoice) {
                    case 1:
                        include(sc, emplyoees);
                        break;
                    case 2:
                        locate(sc, emplyoees);
                        break;
                    case 3:
                        listaAll(sc, emplyoees);
                        break;
                    default:
                        doContinue = false;
                }

            } while (doContinue);

        }

        System.out.println("FIM DO PROGRAMA");

    }

    // endregion

}
