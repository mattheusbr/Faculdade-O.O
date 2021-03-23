package com.company;

public class ClienteEspecial extends Cliente{
    @Override
    public double Financiar() {
        return 0;
    }

    @Override
    public double ConsultarSaldo() {
        return 0;
    }

    @Override
    public void Depositar(double saldo) {

    }

    @Override
    public void Transferir() {

    }

    @Override
    public void Sacar(double saldo) {

    }
}
