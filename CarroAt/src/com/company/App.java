package com.company;

public class App {
    private String fabricante;
    private String modelo;
    private double preco;
    private int ano_Fabricacao;

    public App(String fabricante, String modelo, int ano_Fabricacao, double preco) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.preco = preco;
        this.ano_Fabricacao = ano_Fabricacao;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno_Fabricacao() {
        return this.ano_Fabricacao;
    }

    public void setAno_Fabricacao(int ano_Fabricacao) {
        this.ano_Fabricacao = ano_Fabricacao;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    void ConsultarDados(){
    }

    void Depreciacao() {
    }
}
