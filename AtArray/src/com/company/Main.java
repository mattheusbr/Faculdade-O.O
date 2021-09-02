package com.company;

import javax.swing.*;

public class Main {

    private static Boolean sairMain = false;
    private final static int TIPOMES = 1;
    private final static int TIPOSEMANA = 2;

    public static void main(String[] args) {

        MesSemana mesSemana = new MesSemana();
        mesSemana.AdicionarMes();
        mesSemana.AdicionarDia();

        while (!sairMain) {

            int valorMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "======== Consulta ========" +
                    "\n1 - Consulta pelo mês" +
                    "\n2 - Consulta pela semana" +
                    "\n0 - Sair"+
                    "\n======== Consulta ========"));

            switch (valorMenu) {
                case TIPOMES:
                    clear();
                    mesSemana.ConsultaMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor de 1 a 12: ")));
                    break;
                case TIPOSEMANA:
                    clear();
                    mesSemana.ConsultaDia(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor de 1 a 7: ")));
                    break;
                case 0:
                    sairMain = true;
                    break;
                default:
                    System.out.println("Valor inválido. Saindo...");
            }
        }
    }

    private static void clear()
    {
        for(int i = 0; i < 25; i++)
            System.out.println("");
    }
}
