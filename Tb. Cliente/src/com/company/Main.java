package com.company;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static ClienteComum clienteComum = new ClienteComum();
    final static char CLIENTE_COMUM = 'C';
    final static char CLIENTE_ESPECIAL = 'E';

    public static void main(String[] args){
	// write your code here

        System.out.println("Informe o tipo do cliente.");
        System.out.println("(E) para cliente especial ou (C) para cliente normal.");
        clienteComum.tipoCliente = sc.next().toUpperCase(Locale.ROOT).charAt(0);

        try {
            if (clienteComum.tipoCliente == CLIENTE_COMUM)
                MontarMenuClienteC();
            else if(clienteComum.tipoCliente == CLIENTE_ESPECIAL)
                System.out.println("teste especial");
            else
                System.out.println("Valor inválido. Saindo...");

        }catch (IOException ex){
            System.out.println("Erro: " + ex.getMessage());
        }

    }

    public static void MontarMenuClienteC() throws IOException {
        clear();

        Boolean sair = false;
        while (!sair){
            TextoMenu();
            switch (sc.nextInt()){
                case 1:
                    System.out.println("Valor max. mensalidade financiamento: " + clienteComum.Financiar());
                    System.in.read();
                    clear();
                    break;

                case 2:
                    System.out.println("Saldo atual: " + clienteComum.ConsultarSaldo());
                    System.in.read();
                    clear();
                    break;

                case 3:
                    System.out.println("Digite o valor do depósito: ");
                    clienteComum.Depositar(sc.nextDouble());
                    clear();
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 0:
                    sair = true;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Valor inexistente.");
                    break;
            }
        }

    }
    private static void TextoMenu(){
        
        System.out.println("=======================================");
        System.out.println("1 - Simular Financiamento");
        System.out.println("2 - Consultar Saldo");
        System.out.println("3 - Depositar");
        System.out.println("4 - Transferir");
        System.out.println("5 - Sacar");
        System.out.println("0 - Sair");
        System.out.println("=======================================");
    }

    public static void clear()
    {
        for(int i = 0; i < 25; i++)
            System.out.println("");
    }
}
