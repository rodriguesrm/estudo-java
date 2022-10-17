package etapa.basica;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

    public static void atividades() {
        entradaDeDados();
    }

    /**
     * Atividade de entrada de dados
     */
    private static void entradaDeDados() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        System.out.print("Informe o seu nome Completo: ");
        nome = sc.nextLine();

        String pronome;
        System.out.print("Como você gostaria de ser tratado (pronome): ");
        pronome = sc.next();

        char genero;
        System.out.print("Informe seu gênero (M)asculino/(F)eminino: ");
        genero = sc.next().charAt(0);

        int idade;
        System.out.print("Informe sua idade? ");
        idade = sc.nextInt();

        double salario;
        System.out.print("Informe seu salario? ");
        salario = sc.nextDouble();

        String cidade;
        System.out.print("Informe a cidade que você mora: ");
        if (sc.hasNextLine())
            sc.nextLine();
        cidade = sc.nextLine();

        Locale currentLocate = Locale.getDefault();
        Locale.setDefault(new Locale("pt", "BR"));
        System.out.printf("Olá %s %s%nVocê é do sexo %s, tem %d anos e seu salário é R$ %.2f.%nVocê mora em %s", pronome, nome, genero, idade, salario, cidade);
        Locale.setDefault(currentLocate);

        sc.close();

    }

}
