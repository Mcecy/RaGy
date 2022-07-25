package entidades;

public class Funcionario {

    private int id;
    private String name;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(int id, String name, double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentoSalario(double porcen) {
        this.salario = (porcen / 100 + 1) * this.salario;
        return this.salario;
    }

    public String toString() {
        return id
                + ", "
                + name
                + ", "
                + String.format("%.2f", salario);
    }

}