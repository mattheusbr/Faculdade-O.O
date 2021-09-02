package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Soma soma = new Soma();
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro:", "Digite o valor"));
        int somaNumerosPares = soma.SomaNumerosPares(numero);
        int somaNumerosImpares = soma.SomaNumerosImpares(numero);

        JOptionPane.showMessageDialog(null, "Numero informado: " + numero +
                                                         "\nSoma dos números pares: " + somaNumerosPares +
                                                         "\nSoma dos números ímpares: " + somaNumerosImpares);
    }
}
