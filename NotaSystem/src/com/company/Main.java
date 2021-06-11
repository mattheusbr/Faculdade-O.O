package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Nota n = new Nota();

        ArrayList<Integer> aux = new ArrayList<Integer>(3);
        String nome = JOptionPane.showInputDialog(null, "Entre com o nome do aluno: ");
        n.setNome(nome);

        for(int i = 0; i < 3; i++){
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Entre com a nota: "));
            aux.add(nota);
        }

        n.setNotas(aux);
        n.organizar();
        n.maiorMenor();
        n.boletim();
    }
}
