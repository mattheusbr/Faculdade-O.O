package com.company;

import javax.swing.*;

public class VendaFracionadaException extends Exception{

    public void mensagem(){
        JOptionPane.showMessageDialog(null,
                "Erro",
                "A quantidade a comprar é fracionada",
                JOptionPane.ERROR_MESSAGE);
    }
}
