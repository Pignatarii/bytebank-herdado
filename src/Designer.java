//Gerente herda da class Funcionario
public class Designer extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println(
                "Chamando o método de bonificacao do DESIGNER");
        return 200;
    }
}
