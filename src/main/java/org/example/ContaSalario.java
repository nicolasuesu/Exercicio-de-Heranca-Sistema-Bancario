package org.example;

class ContaSalario extends ContaCorrente {
    int saquesRealizados = 0;

    public ContaSalario(String numeroConta, String titular, double saldo, double limite) {
        super(numeroConta, titular, saldo, limite);
    }

    @Override
    boolean sacar(double valor) {
        if(saquesRealizados == 0) {
            saquesRealizados++;
            return super.sacar(valor);
        } else {
            return super.sacar(valor + 5);
        }
    }
}