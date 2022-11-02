package application;

import application.entities.Triangle;
import util.Geometric;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
//        casoPropostOrientacaoObjeto();
        classeEstatica1();

    }

    private static void classeEstatica1() {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o raio: ");
            double raio = sc.nextDouble();

            double c = Geometric.circumference(raio);
            double v = Geometric.volume(raio);

            System.out.printf("Circunferência: %.2f%n", c);
            System.out.printf("Volume: %.2f%n", v);
            System.out.printf("Valor de PI: %.2f%n", Geometric.PI);

        }

    }

    private static void casoPropostOrientacaoObjeto() {
        solucaoSemOrientacaoObjeto();
        solucaoComOrientacaoObjeto();
    }

    private static void solucaoComOrientacaoObjeto() {

        Triangle x = new Triangle();
        Triangle y;

        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Entre com as medidas do triangulo X");
            x.setA(sc.nextDouble());
            x.setB(sc.nextDouble());
            x.setC(sc.nextDouble());

            System.out.println("Entre com as medidas do triangulo Y");
            y = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        }

        if (!x.isValid())
            System.out.println("O triângulo X é inválido");

        if (!y.isValid())
            System.out.println("O triângulo Y é inválido");

        if (x.isValid() && y.isValid()) {

            System.out.printf("Triangulo X possui a área de %.4f%n", x.getArea());
            System.out.printf("Triangulo Y possui a área de %.4f%n", y.getArea());

            if (x.getArea() > y.getArea())
                System.out.println("A maior área é do triângulo X");
            else
                System.out.println("A maior área é do triângulo Y");

        }

    }

    private static void solucaoSemOrientacaoObjeto() {

        // Solução sem OO

        double xA, xB, xC, yA, yB, yC;

        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Entre com as medidas do triangulo X");
            xA = sc.nextDouble();
            xB = sc.nextDouble();
            xC = sc.nextDouble();

            System.out.println("Entre com as medidas do triangulo Y");
            yA = sc.nextDouble();
            yB = sc.nextDouble();
            yC = sc.nextDouble();

        }

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangulo X poxsui a área de %.4f%n", areaX);
        System.out.printf("Triangulo Y poxsui a área de %.4f%n", areaY);

        if (areaX > areaY)
            System.out.println("A maior área é do triângulo X");
        else
            System.out.println("A maior área é do triângulo Y");

    }

}
