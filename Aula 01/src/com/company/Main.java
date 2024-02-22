package com.company;

import com.company.aula02.Aluno;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private static final Random gerador = new Random();
    private static Timer timer = new Timer();
    public static void main(String[] args) {
        IniciarTarefa();
        //TestKey();



        //Scanner scanner = new Scanner(System.in);
        //Aluno aluno = new Aluno();

        //System.out.println("Digite o nome:");
        //aluno.nome = scanner.nextLine();
        //System.out.println("Digite a primeira nota: ");
        //aluno.nota1 = scanner.nextDouble();
        //System.out.println("Digite a segunda nota: ");
        //aluno.nota2 = scanner.nextDouble();

        //System.out.println("A media de " + aluno.nome + " é " + aluno.calcularMeida());
    }

    private static void TestKey(){
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(9);

        final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
        final String LETRAS_MAIUSCULAS = LETRAS_MINUSCULAS.toUpperCase();
        final String NUMEROS = "0123456789";
        final String VALORES_A_GERAR = LETRAS_MINUSCULAS + LETRAS_MAIUSCULAS + NUMEROS;

        for (int i = 1; i <= 9; i++){
            int indice = random.nextInt(VALORES_A_GERAR.length());
            char caractereAleatorio = VALORES_A_GERAR.charAt(indice);
            sb.append(caractereAleatorio);
            if(i == 3 || i == 6)
                sb.append('-');
        }
çl
        System.out.println(sb.toString());
    }

    private static void IniciarTarefa(){
        timer.schedule(new TimerTask() {
            public void run() {

                System.out.println("Teste");
            }
        }, 0, 3000);
    }

    private static void PararTarefa(){
        timer.cancel();
    }
}
