import Banco.Conta;
import Banco.ContaCorrente;
import Banco.ContaPoupanca;
import Cliente.Cliente;

public class Main {

    public static void main(String[] args) {

        Cliente kauan = new Cliente("Kauan");

        Conta cc = new ContaCorrente(kauan);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(kauan);

        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
