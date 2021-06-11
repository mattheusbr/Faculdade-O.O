package com.company;

public class Soma {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(){
        this.numero = numero;
    }

    public int SomaNumerosImpares(int numero){
        int soma=0;

        for(int i = 1; i <= numero; i = i + 2) {
            soma += i;
        }
        return soma;
    }

    public int SomaNumerosPares(int numero){
        int soma = 0;

        for(int i = 2; i <= numero; i += 2) {
            soma += i;
        }
        return soma;

    }
}
