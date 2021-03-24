package com.company;

public class ClienteEspecial extends Cliente{

    private int qtdMovimentacao = 0;

    @Override
    public double Financiar() {
        return (this.saldoMedio * 0.50);
    }

    @Override
    public double ConsultarSaldo() {
        return 0;
    }

    @Override
    public void Depositar(double saldo) {
        this.saldo += saldo;

        qtdMovimentacao++;
        this.saldoMedio = this.saldo / qtdMovimentacao;
    }

    @Override
    public void Transferir() {

    }

    @Override
    public void Sacar(double saldo) {

    }
}
