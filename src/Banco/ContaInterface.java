package Banco;

public interface ContaInterface {


    void sacar(double Valor);

    void depositar(double Valor);

    void transferir(double Valor, Conta contaDestino);

    void imprimirExtrato();
}
