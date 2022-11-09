import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public static void exercicioLista01() {

        List<String> nomes = new ArrayList<String>();

        nomes.add("Rodrigo");
        nomes.add("Luciene");
        nomes.add("Amanda");
        nomes.add("Tiago");
        nomes.add("Paola");
        nomes.add("Capitao Nascimento");
        nomes.add("Daniel");
        nomes.add("Maria");
        nomes.add("INTRUSO 1");
        nomes.add("Miguel");

        nomes.add(2, "Carol");

        System.out.println("--[ LISTA INICIAL ] ---------------------------");
        imprimirListaString(nomes);

        nomes.remove("INTRUSO 1");
        nomes.remove(6);
        nomes.removeIf(x -> x.endsWith("l"));

        System.out.println("--[ LISTA ALTERADA ] --------------------------");
        imprimirListaString(nomes);

        System.out.printf("%nO nome 'Tiago' está na posição %s%n%n", nomes.indexOf("Tiago"));

        System.out.println("--[ NOMES SEM LETRA 'A' ] ---------------------");
        List<String> nomesSemLetraA = nomes
                .stream()
                .filter(x -> !x.toUpperCase().contains("A"))
                .collect(Collectors.toList());
        imprimirListaString(nomesSemLetraA);

        System.out.println("--[ PRIMEIRO NOME QUE POSSUA A LETRA 'L' ] ----");
        String primeiroComLetraL = nomes
                .stream()
                .filter(x -> x.toUpperCase().contains("X"))
                .findFirst()
                .orElse(null);
        System.out.println(primeiroComLetraL);
    }

    private static void imprimirListaString(List<String> lista) {
        for (String item : lista) {
            System.out.println(item);
        }
    }

}
