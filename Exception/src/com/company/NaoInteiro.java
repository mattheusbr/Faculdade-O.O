package com.company;

public class NaoInteiro extends Exception{
    int n;
    int d;

    public NaoInteiro(int i, int j){
        this.n = i;
        this.d = j;
    }

    public String toString(){
        return "Resultado de " + n + "/" + d + " não é inteiro.";
    }

}
