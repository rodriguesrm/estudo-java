import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        entradaDeDados();
//        exercicioConcatenacao();
//        EstruturasCondicionais.atividade();
//        EstruturasDeRepeticao.atividade();
        CondicaoBitwise.atividade();

    }

    /**
     * Exercício de Concatenação
     */
    private static void exercicioConcatenacao(){

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");

        System.out.printf("%s, with price is $ %.2f%n", product1, price1);
        System.out.printf("%s, with price is $ %.2f%n", product2, price2);

        System.out.println();

        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);

        System.out.println();

        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places) with eight decimal places: %.3f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point %.3f%n", measure);

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