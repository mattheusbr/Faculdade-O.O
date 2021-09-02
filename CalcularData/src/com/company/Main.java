package com.company;

import javax.swing.*;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
	    Intervalo intervalo = new Intervalo();
        String dtInicial = JOptionPane.showInputDialog(null,"Entre com a data inicial (dd/mm/yyyy): ");
        String dtFinal = JOptionPane.showInputDialog(null,"Entre com a data final (dd/mm/yyyy): ");
        intervalo.CalcularIntervalos(dtInicial,dtFinal);
    }
}
