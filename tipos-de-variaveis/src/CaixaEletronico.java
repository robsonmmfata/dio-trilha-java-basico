
//aula sobre condicional simples(controle de fluxo simples)
public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 15.0;

        if (valorSolicitado < saldo)
        saldo = saldo - valorSolicitado ;
       else
       System.out.println("Saldo insuficiente");

        System.out.println(saldo);
    }
}
