package org.example;

public class Main {
    public static void main(String[] args) {
        // Testando as contas
        ContaCorrente cc = new ContaCorrente("001", "João", 1000, 500);
        cc.exibirInformacoes();
        cc.sacar(1200);

        ContaPoupanca cp = new ContaPoupanca("002", "Maria", 1000);
        cp.exibirInformacoes();
        cp.sacar(500);

        ContaInvestimento ci = new ContaInvestimento("003", "Pedro", 1000);
        ci.exibirInformacoes();
        ci.sacar(100);

        ContaSalario cs = new ContaSalario("004", "Ana", 1000, 0);
        cs.exibirInformacoes();
        cs.sacar(100); // primeiro saque (sem taxa)
        cs.sacar(100); // segundo saque (com taxa)

        ContaInvestimentoAltoRisco ciar = new ContaInvestimentoAltoRisco("005", "Carlos", 15000);
        ciar.exibirInformacoes();
        ciar.sacar(1000);
    }
}