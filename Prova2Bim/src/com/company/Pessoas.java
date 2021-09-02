package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Pessoas {
    private ArrayList<Integer> idade= new ArrayList<Integer>(3);
    private int id1;
    private int id2;
    private int id3;
    private int id4;
    private int id5;

    public ArrayList<Integer> getIdade() {
        return this.idade;
    }

    public void setIdade(ArrayList<Integer> idade) {
        this.idade = idade;
    }

    public void ValidacaoIdade(){
        for(int i = 0; i < 3; i ++){
            if(idade.get(i) > 0 && idade.get(i) <= 19)
                id1++;
            else if(idade.get(i) >= 20 && idade.get(i) <= 39)
                id2++;
            else if(idade.get(i) >= 40 && idade.get(i) <= 59)
                id3++;
            else if(idade.get(i) >= 60 && idade.get(i) <= 79)
                id4++;
            else if(idade.get(i) >= 80)
                id5++;
        }
    }

    public void MostrarDados(){
        JOptionPane.showMessageDialog(null, "Pessoas entre 0 e 19 anos: " + id1 +
                "\nPessoas entre 20 e 39 anos: " + id2 +
                "\nPessoas entre 40 e 59 anos: " + id3 +
                "\nPessoas entre 60 e 79 anos: " + id4 +
                "\nPessoas mais 80 anos: " + id5
        );
    }
}
