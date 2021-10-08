package com.company;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Vacina {
    private ArrayList<VacinaDto> vacina = new ArrayList<VacinaDto>();

    public void IntervaloVacina(String dataString, int codigoVacina) throws ParseException {
        VacinaDto itemVacina = vacina.stream().filter(x -> x.codigo == codigoVacina).findFirst().get();

        if(itemVacina.codigo == 4){
            JOptionPane.showMessageDialog(null,"A vacina Janssen é dose única.");
            return;
        }

        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        Date data = dt.parse(dataString);
        //Utilizando calendar
        Calendar c = Calendar.getInstance();
        c.setTime(data);
        c.add(c.DATE, itemVacina.intervalo );

        //Utilizando setDate (IDE fala que é obsoleto)
        data.setDate(data.getDate() + itemVacina.intervalo);
        JOptionPane.showMessageDialog(null, "codigo da Vacina: " + itemVacina.codigo +
                                                         "\nDescrição da vacina: " + itemVacina.descricao +
                                                         "\nData próxima dose(setDate): " + dt.format(data) +
                                                         "\nData próxima dose(Calendar): " + dt.format(c.getTime())) ;
    }

    public void Adicionar(){
        vacina.add(new VacinaDto(1, "Coronavac", 25));
        vacina.add(new VacinaDto(2, "Astrazeneca", 84));
        vacina.add(new VacinaDto(3, "Pfizer", 84));
        vacina.add(new VacinaDto(4, "Janssen", 0));
    }

    private class VacinaDto{
        private int codigo;
        private String descricao;
        private int intervalo;

        public VacinaDto(int codigo, String descricao, int intervalo){
            this.codigo = codigo;
            this.descricao = descricao;
            this.intervalo = intervalo;
        }
    }
}

