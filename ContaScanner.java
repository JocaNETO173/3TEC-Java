public class ContaScanner {
    double saldo = 500.0;

    double verificarSaldo() {
        return saldo;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado");
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }
}