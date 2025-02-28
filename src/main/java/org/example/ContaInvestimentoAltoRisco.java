package org.example;

class ContaInvestimentoAltoRisco extends ContaInvestimento {
    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    boolean sacar(double valor) {
        if(saldo >= 10000) {
            double taxa = valor * 0.05;
            if(valor + taxa <= saldo) {
                saldo -= (valor + taxa);
                System.out.println("Saque: R$" + valor);
                System.out.println("Taxa: R$" + taxa);
                return true;
            }
        }
        System.out.println("Saque não permitido");
        return false;
    }
}