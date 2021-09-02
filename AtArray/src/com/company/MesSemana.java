package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class MesSemana {
    private ArrayList<mesDto> mes = new ArrayList<mesDto>();
    private ArrayList<diaDto> dia = new ArrayList<diaDto>();


    public void ConsultaMes(int numeroMes){
        if(!(numeroMes > 12 || numeroMes <= 0)){
            String mesExtenso = mes.stream().filter(x -> x.numeroMes == numeroMes).findFirst().get().mes;
            JOptionPane.showMessageDialog(null, "O mês referente ao número solicitado é: " + mesExtenso);
        }else{
            JOptionPane.showMessageDialog(null, "Valor necessita ser de 1 a 12");
        }
    }

    public void ConsultaDia(int numeroDia){
        if(!(numeroDia > 7 || numeroDia <= 0)){
            String diaExtensao = dia.stream().filter(x -> x.numeroDia == numeroDia).findFirst().get().dia;
            JOptionPane.showMessageDialog(null, "O dia referente ao número solicitado é: " + diaExtensao);
        }else{
            JOptionPane.showMessageDialog(null, "Valor necessita ser de 1 a 7");
        }
    }

    public void AdicionarMes(){
        mes.add(new mesDto("Janeiro", 1));
        mes.add(new mesDto("Fevereiro", 2));
        mes.add(new mesDto("Março",3));
        mes.add(new mesDto("Abril", 4));
        mes.add(new mesDto("Maio", 5));
        mes.add(new mesDto("Junho",6));
        mes.add(new mesDto("Julho", 7));
        mes.add(new mesDto("Agosto", 8));
        mes.add(new mesDto("Setembro", 9));
        mes.add(new mesDto("Outubro", 10));
        mes.add(new mesDto("Novembro", 11));
        mes.add(new mesDto("Dezembro", 12));
    }

    public void AdicionarDia(){
        dia.add(new diaDto("Domingo", 1));
        dia.add(new diaDto("Segunda", 2));
        dia.add(new diaDto("Terça",3));
        dia.add(new diaDto("Quarta", 4));
        dia.add(new diaDto("Quinta", 5));
        dia.add(new diaDto("Sexta",6));
        dia.add(new diaDto("Sábado", 7));
    }

    private class mesDto{
        private String mes;
        private int numeroMes;

        public mesDto(String mes, int numeroMes){
            this.mes = mes;
            this.numeroMes = numeroMes;
        }
    }

    private class diaDto{
        private String dia;
        private int numeroDia;

        public diaDto(String dia, int numeroDia){
            this.dia = dia;
            this.numeroDia = numeroDia;
        }
    }
}

