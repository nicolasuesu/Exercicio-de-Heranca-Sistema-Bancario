package org.example;

class ContaCorrente extends ContaBancaria {
    double limite;

    public ContaCorrente(String numeroConta, String titular, double saldo, double limite) {
        super(numeroConta, titular, saldo);
        this.limite = limite;
    }

    @Override
    boolean sacar(double valor) {
        if(valor <= (saldo + limite)) {
            saldo -= valor;
            System.out.println("Saque: R$" + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
}