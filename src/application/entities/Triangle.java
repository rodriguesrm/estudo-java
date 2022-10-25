package application.entities;

import java.awt.dnd.InvalidDnDOperationException;

public class Triangle {

    // region Objetos/Variáveis locais

    private double a;
    private double b;
    private double c;

    private double semiPerimetro;

    // endregion

    // region Construtores

    public Triangle() { this(0, 0, 0); }

    /**
     * Cria uma nova instância do triângulo
     * @param a Medida do lado A do triângulo
     * @param b Medida do lado B do triângulo
     * @param c Medida do lado C do triângulo
     */
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        calculaArea();
    }
    // endregion

    // region Propriedades

    public void setA(double a) {
        this.a = a;
        calculaArea();
    }
    public double getA() { return this.a; }

    public void setB(double b) {
        this.b = b;
        calculaArea();
    }
    public double getB() { return this.b; }

    public void setC(double c) {
        this.c = c;
        calculaArea();
    }
    public double getC() { return this.c; }

    // endregion

    // region Métodos Locais
    private void calculaArea() {
        this.semiPerimetro = (this.a + this.b + this.c) / 2.0;
    }
    // endregion

    // region Métodos Públicos

    /**
     * Calcula a área do triângulo
     */
    public double getArea() {
        if (!isValid())
            throw  new InvalidDnDOperationException("O triângulo é inválido");
        return Math.sqrt(this.semiPerimetro);
    }

    public boolean isValid() {
        return (this.semiPerimetro > 0);
    }

    // endregion

}
