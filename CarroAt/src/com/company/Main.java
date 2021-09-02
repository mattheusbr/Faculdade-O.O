package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        String fabricante;
        String modelo;
        double preco;
        int ano_Fabricacao;
        int i;
        boolean sair = false;

        fabricante = JOptionPane.showInputDialog("Entre com o fabricante do carro: ");
        modelo = JOptionPane.showInputDialog("Entre com o modelo do carro: ");
        ano_Fabricacao = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano do carro: "));
        preco = Double.parseDouble(JOptionPane.showInputDialog("Entre o preço do carro: "));

        App carro = new Carro(fabricante, modelo, ano_Fabricacao, preco);
        App utilitario = new Utilitario(fabricante, modelo, ano_Fabricacao, preco);

        int tipoCarro = Integer.parseInt(JOptionPane.showInputDialog("1 - Carro\n2- Utilitário"));
        // Carro
        if (tipoCarro == 1) {
            while (sair == false) {
                i = menu();

                switch (i) {
                    case 1:
                        carro.ConsultarDados();
                        break;

                    case 2:
                        carro.Depreciacao();
                        break;

                    case 3:
                        sair = true;
                        break;
                }
            }
        }

        // Utilitario
        else if (tipoCarro == 2) {
            while (sair == false) {
                i = menu();

                switch (i) {
                    case 1:
                        utilitario.ConsultarDados();
                        break;

                    case 2:
                        utilitario.Depreciacao();
                        break;

                    case 3:
                        sair = true;
                        break;

                }
            }
        }
    }

    public static Integer menu() {
        return Integer.parseInt(JOptionPane.showInputDialog("---------- Menu ----------\n1 - Consultar Dados\n2 - Depreciação \n3 - Sair"));
    }
}
