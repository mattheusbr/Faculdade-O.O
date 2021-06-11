package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Nota {
    private String nome;
    private int mediaNotas;
    private int maiorNota, menorNota;
    private ArrayList<Integer> notas = new ArrayList<Integer>(3);

    public int getMaiorNota() {
        return this.maiorNota;
    }

    public void setMaiorNota(int maiorNota) {
        this.maiorNota = maiorNota;
    }

    public int getMenorNota() {
        return this.menorNota;
    }

    public void setMenorNota(int menorNota) {
        this.menorNota = menorNota;
    }

    public ArrayList<Integer> getNotas() {
        return this.notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMediaNotas() {
        return this.mediaNotas;
    }

    public void setMediaNotas(int mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public void organizar(){
        Collections.sort(notas);
    }

    public void maiorMenor(){
        maiorNota = Collections.max(notas);
        menorNota = Collections.min(notas);
    }

    public int calcMedia(int mediaNotas){
        mediaNotas = (notas.get(0) + notas.get(1) + notas.get(2)) / 3;
        return mediaNotas;
    }

    public int calcMedia2(int mediaNotas){
        mediaNotas = (notas.get(1) + notas.get(2)) / 2;
        return mediaNotas;
    }

    public void boletim(){
        JOptionPane.showMessageDialog(null, "======== Boletim ========" +
                "\nNome do Aluno: " + nome +
                "\nMédia das 3 notas: " + calcMedia(mediaNotas) +
                "\nMédia das 2 maiores notas: " + calcMedia2(mediaNotas) +
                "\n======== Boletim ========");
    }
}
