package org.example;

class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    boolean sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque: R$" + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
}