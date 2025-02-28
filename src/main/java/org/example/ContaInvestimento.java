package org.example;

class ContaInvestimento extends ContaBancaria {
    public ContaInvestimento(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    boolean sacar(double valor) {
        double taxa = valor * 0.02;
        if(valor + taxa <= saldo) {
            saldo -= (valor + taxa);
            System.out.println("Saque: R$" + valor);
            System.out.println("Taxa: R$" + taxa);
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
}