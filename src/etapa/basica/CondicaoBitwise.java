package etapa.basica;

import java.util.Scanner;

public class CondicaoBitwise {

    public static void atividade() {
//        exemplo1();
//        testeSextoBit();
        testeComBooleanos();
    }

    private static void separador() { separador(""); }
    private static void separador(String titulo) {
        if (titulo.length() == 0)
            System.out.println("------------------------------------------------------");
        else
            System.out.printf("%n======================================================%n=== %s%n======================================================%n", titulo);
    }

    private static void testeSextoBit() {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Informe um número inteiro: ");
            int entrada = sc.nextInt();
            int mascara = 0b100000; // 32
            if ((mascara & entrada) != 0)
                System.out.println("O sexto bit é 1");
            else
                System.out.println("O sexto bit é 0");
        }

    }

    private static void exemplo1() {

        separador("Exemplo 1");

        int n1 = 89;
        int n2 = 60;

        System.out.printf("N1 = %d, N2 = %d%n%n", n1, n2);

        System.out.print("N1 & N2: ");
        System.out.println(n1 & n2);

        System.out.print("N1 | N2: ");
        System.out.println(n1 | n2);

        System.out.print("N1 ^ N2: ");
        System.out.println(n1 ^ n2);

        separador();

    }

    private static void testeComBooleanos() {

        separador("AND Exclusivo (&)");
        System.out.printf("false & false: %s%n", (false & false) ? "T" : "F");
        System.out.printf("false & true: %s%n", (false & true) ? "T" : "F");
        System.out.printf("true & false: %s%n", (true & false) ? "T" : "F");
        System.out.printf("true & true: %s%n", (true & true) ? "T" : "F");

        separador("OR Exclusivo (|)");
        System.out.printf("false | false: %s%n", (false | false) ? "T" : "F");
        System.out.printf("false | true: %s%n", (false | true) ? "T" : "F");
        System.out.printf("true | false: %s%n", (true | false) ? "T" : "F");
        System.out.printf("true | true: %s%n", (true | true) ? "T" : "F");

        separador("XOR Exclusivo (^)");
        System.out.printf("false ^ false: %s%n", (false ^ false) ? "T" : "F");
        System.out.printf("false ^ true: %s%n", (false ^ true) ? "T" : "F");
        System.out.printf("true ^ false: %s%n", (true ^ false) ? "T" : "F");
        System.out.printf("true ^ true: %s%n", (true ^ true) ? "T" : "F");

    }

}
