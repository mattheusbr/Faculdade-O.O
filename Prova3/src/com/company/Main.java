    package com.company;

    import javax.swing.*;
    import java.text.ParseException;

    public class Main {

        public static void main(String[] args) throws ParseException {
            Vacina vacina = new Vacina();
            vacina.Adicionar();
            String dtPrimeiraDose = JOptionPane.showInputDialog(null,"Entre com a data que recebeu a primeira dose (dd/mm/yyyy): ");
            int codigoVacina = Integer.parseInt(JOptionPane.showInputDialog(null,"1 - Coronavac \n2 - Astrazeneca \n3 - Pfizer \n4 - Janssen \nInforme o código: "));
            vacina.IntervaloVacina(dtPrimeiraDose, codigoVacina);
        }
    }
