package com.company;
import javax.swing.*;

public class Main {

    private static Veiculo veiculo = new Veiculo();

    public Main(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public static void main(String[] args) {

        Double precoVeiculo;
        Double percentualImposto;
        Double percentualDistribuidor;
        Double valorLucroDistribuidor;
        Double valorImposto;

        String item = JOptionPane.showInputDialog(null, "Qual o valor do veiculo: ");
        precoVeiculo = item == null ? -0.1 : Double.parseDouble(item);

        if(precoVeiculo <= 0)
            return;

        String item2 = JOptionPane.showInputDialog(null, "Qual o percentual do imposto: ");
        percentualImposto = item2 == null ? -0.1 : Double.parseDouble(item2);

        if(percentualImposto <= 0)
            return;

        String item3 = JOptionPane.showInputDialog(null, "Qual o percentual do distribuidor: ");
        percentualDistribuidor = item3 == null ? -0.1 : Double.parseDouble(item3);

        if(percentualDistribuidor <= 0)
            return;

        percentualImposto /= 100;
        percentualDistribuidor /= 100;

        valorLucroDistribuidor = veiculo.CalcularLucroDoDistribuidor(veiculo.CalcularImposto(percentualImposto, precoVeiculo),
                                                                    precoVeiculo,
                                                                    percentualDistribuidor);
        valorImposto = veiculo.CalcularImposto(percentualImposto,precoVeiculo);

        veiculo.ComprovanteValorVeiculo(valorLucroDistribuidor, valorImposto,
                veiculo.CalcularPrecoFinal(precoVeiculo,valorLucroDistribuidor, valorImposto));

    }
}
