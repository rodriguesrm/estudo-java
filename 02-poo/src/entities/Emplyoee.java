package entities;

/**
 * Classe do objeto de funcionário
 */
public class Emplyoee {

    // region Attributes

    int id;
    String name;
    double salary;

    // endregion

    // region Constructors

    /** Cria uma nova instância de Emplyoee */
    public Emplyoee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // endregion

    // region Getters / Setters

    /** Get current id value */
    public int getId() {
        return id;
    }

    /** Get current name value */
    public String getName() {
        return name;
    }

    /** Set a new name value */
    public void setName(String name) {
        this.name = name;
    }

    /** Get current salary value */
    public double getSalary() {
        return salary;
    }

    /** Set a new salary id value */
    public void setSalary(double salary) {
        if (salary <= 0 )
            throw new IllegalArgumentException("O valor do salário deve ser maior do que 0 (zero)");
        this.salary = salary;
    }

    // endregion

}
