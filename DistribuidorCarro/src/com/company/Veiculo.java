package com.company;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Veiculo {





    public Double CalcularImposto(Double impostoVeiculo, Double valorVeiculo){
        return valorVeiculo * impostoVeiculo;
    }

    public Double CalcularLucroDoDistribuidor(Double impostoVeiculo, Double valorVeiculo, Double porcentagemLucro){
        return (impostoVeiculo + valorVeiculo) * porcentagemLucro;
    }

    public Double CalcularPrecoFinal(Double valorVeiculo, Double valorDoDistribuidor, Double valorImposto){
        return valorVeiculo + valorDoDistribuidor + valorImposto;
    }

    public void ComprovanteValorVeiculo(Double lucroDistribuidor, Double imposto, Double precoFinalveiculo){

        DecimalFormat deci = new DecimalFormat("0.00");

        JOptionPane.showMessageDialog(null, "======== Valor veiculo ========" +
                "\nValor do distribuidor: " + deci.format(lucroDistribuidor) +
                "\nValor do imposto: " + deci.format(imposto) +
                "\nValor final veículo: " + deci.format(precoFinalveiculo) +
                "\n======== Valor veiculo ========");
    }
}
