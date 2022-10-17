package application.entities;

public class Triangle {

    // region Propriedades

    public double a;
    public double b;
    public double c;

    // endregion

    // region Métodos

    /**
     * Calcula a área do triângulo
     */
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // endregion

}
