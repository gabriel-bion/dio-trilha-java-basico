public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.00;

        if(valorSolicitado < saldo)
            saldo -= valorSolicitado;
        else 
            System.out.print("Você não possui saldo suficiente. Saldo atual R$");
        System.out.println(saldo);
    }
}
