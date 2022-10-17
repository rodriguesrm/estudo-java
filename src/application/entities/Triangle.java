package application.entities;

public class Triangle {

    // region Objetos/Variáveis locais
    private double a;
    private double b;
    private double c;
    // endregion

    // region Construtores

    public Triangle() {
        this.a = this.b = this.c = 0;
    }

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
    }
    // endregion

    // region Propriedades

    public void setA(double a) { this.a = a; }
    public double getA() { return this.a; }

    public void setB(double b) { this.b = b; }
    public double getB() { return this.b; }

    public void setC(double c) { this.c = c; }
    public double getC() { return this.c; }

    // endregion

    // region Métodos

    /**
     * Calcula a área do triângulo
     */
    public double getArea() {
        double p = (this.a + this.b + this.c) / 2.0;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    // endregion

}
