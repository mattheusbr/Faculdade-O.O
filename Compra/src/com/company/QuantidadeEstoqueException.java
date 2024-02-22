package com.company;

import javax.swing.*;

public class QuantidadeEstoqueException extends Exception{
    int qtdComprar;
    int estoque;

    QuantidadeEstoqueException(int qtdComprar, int estoque){
        this.qtdComprar = qtdComprar;
        this.estoque = estoque;
    }

    public void mensagem(){
        JOptionPane.showMessageDialog(null,
                "Erro",
                "A quantidade comprada é maior que a disponivel em estoque." +
                        "\nEstoque: " + estoque + "\nQuantidade a comprar: " + qtdComprar ,
                JOptionPane.ERROR_MESSAGE);

    }

}
