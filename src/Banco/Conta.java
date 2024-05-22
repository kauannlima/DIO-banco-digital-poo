package Banco;

import Cliente.Cliente;

public abstract class Conta implements ContaInterface{

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void impirmirDadosConta(){
        System.out.println(String.format("Titular %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia %d",agencia));
        System.out.println(String.format("Número Conta %d",numeroConta));
        System.out.println(String.format("Saldo %.2f",saldo));
    }
}
