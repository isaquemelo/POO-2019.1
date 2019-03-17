import java.util.Arrays;

public class Professor {
    private String grau;
    private long matricula;
    private String nome;
    private double salario;

    Professor(String nome, String grau, long matricula, double salario) {
        this.nome = nome;
        this.grau = grau;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
