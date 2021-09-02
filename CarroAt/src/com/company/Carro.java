package com.company;

import javax.swing.*;

public class Carro extends App{
    public Carro(String fabricante, String modelo, int ano_Fabricacao, double preco) {
        super(fabricante, modelo, ano_Fabricacao, preco);
    }

    @Override
    void ConsultarDados() {
        JOptionPane.showMessageDialog(null, "Fabricante do carro: " + getFabricante() +
                "\nModelo do carro: " + getModelo() +
                "\nPreço do carro: R$" + getPreco() +
                "\nAno do carro: " + getAno_Fabricacao());
    }

    //Depreciação Utilitario 0,7%
    @Override
    void Depreciacao() {
        int tempo_Uso;
        double preco_Final, preco;
        tempo_Uso = 2021 - getAno_Fabricacao();
        preco_Final = getPreco() * Math.pow(1 + (-0.007), tempo_Uso);
        preco = getPreco() - preco_Final;
        JOptionPane.showMessageDialog(null, String.format("O preço final do carro é:  R$ %.2f", preco));
    }
}
