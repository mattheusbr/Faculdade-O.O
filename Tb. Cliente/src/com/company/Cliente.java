package com.company;

import sun.security.util.Password;

import java.util.Scanner;

abstract class Cliente {

    Scanner sc = new Scanner(System.in);
    public String nome;
    public double saldo;
    public double saldoMedio;
    public char tipoCliente;
    public String senha;
    public String cpf;

    public abstract double Financiar();
    public abstract double ConsultarSaldo();
    public abstract void Depositar(double saldo);
    public abstract void Transferir();
    public abstract void Sacar(double saldo);
}
