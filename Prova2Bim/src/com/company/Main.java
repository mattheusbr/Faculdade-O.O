package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pessoas p = new Pessoas();
        ArrayList<Integer> aux = new ArrayList<Integer>(3);
        for (int i = 0; i < 3; i++){
            aux.add(Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade do paciente: ")));
        }
        p.setIdade(aux);
        p.ValidacaoIdade();
        p.MostrarDados();
    }
}
