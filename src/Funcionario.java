//nao pode instanciar dessa classe pq é abstrata
public abstract class Funcionario {
    private String nome;
    private String CPF;
    private double salario;

    public Funcionario() {

    }

    //método sem corpo, nao há implementacao.
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
