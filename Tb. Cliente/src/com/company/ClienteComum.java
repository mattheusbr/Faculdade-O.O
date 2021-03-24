package com.company;

public class ClienteComum extends Cliente {

    private int qtdMovimentacao = 0;

    @Override
    public double Financiar() {
        return (this.saldoMedio * 0.35);
    }

    @Override
    public double ConsultarSaldo() {

        return this.saldo;
    }

    @Override
    public void Depositar(double saldo) {
        this.saldo += saldo;

        qtdMovimentacao++;
        this.saldoMedio = this.saldo / qtdMovimentacao;

    }

    @Override
    public void Transferir(double valorTransferir) {
        ClienteEspecial cc = new ClienteEspecial();
        this.saldo -= valorTransferir;
        cc.saldo += valorTransferir;
    }

    @Override
    public void Sacar(double saldo) {
        this.saldo -= saldo;

        qtdMovimentacao++;
        this.saldoMedio = this.saldo / qtdMovimentacao;
    }
}
