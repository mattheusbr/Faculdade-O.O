package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Compra {

    private ArrayList<ProdutoDto> produto = new ArrayList<ProdutoDto>();

    public void Iniciar(int codigo, String nome, double valor, int quantidade){

    }
    public void Comprar(int codigo, int quantidade, Boolean comprar){
        if(comprar = true){
            for(ProdutoDto item : produto){

            }
        }
    }

    public void InserirEstoque(int codigo, String nome, double valor, int quantidade){
        produto.add(new ProdutoDto(codigo, nome, valor, quantidade));
    }

    public void RemoverEstoque(){

    }

    public void Validar(int codigo, int quantidade){
            try {
                int qtdEstoque = produto.stream().filter(x -> x.codigo == codigo).findFirst().get().quantidade;

                if(quantidade > qtdEstoque)
                    throw new QuantidadeEstoqueException(quantidade, qtdEstoque);


            } catch (QuantidadeEstoqueException e) {
                e.mensagem();
            }
    }



    private class ProdutoDto{
        private int codigo;
        private String nome;
        private double valor;
        private int quantidade;

        public ProdutoDto(int codigo, String nome, double valor, int quantidade){
            this.codigo = codigo;
            this.nome = nome;
            this.valor = valor;
            this.valor = quantidade;
        }
    }
}

