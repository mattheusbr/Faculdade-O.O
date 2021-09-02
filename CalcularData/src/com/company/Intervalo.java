package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.*;

import javax.swing.*;

public class Intervalo {

    public void CalcularIntervalos(String dataInicial, String dataFinal) throws ParseException {
        DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        Date dtInicial = dt.parse(dataInicial);
        Date dtFinal = dt.parse (dataFinal);
        Duration duration = new Duration(new DateTime(dtInicial), new DateTime(dtFinal));
        ExibirDatas(dataInicial,
                    dataFinal,
                    duration.getStandardDays(),
                    duration.getStandardHours(),
                    duration.getStandardMinutes(),
                    duration.getStandardSeconds());
    }

    private void ExibirDatas(String dtInicial, String dtFinal,long dias, long horas, long minutos, long segundos){
        JOptionPane.showMessageDialog(null,"Entre a data " + dtInicial + " - " + dtFinal + " tem um total:" +
                                                        "\nDias: " + dias +
                                                        "\nHoras: " + horas +
                                                        "\nMinutos: " + minutos +
                                                        "\nSegundos: " + segundos);
    }
}