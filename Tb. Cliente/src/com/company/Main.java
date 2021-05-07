package com.company;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static ClienteComum clienteComum = new ClienteComum();
    private static ClienteEspecial clienteEspecial = new ClienteEspecial();
    private final static char CLIENTE_COMUM = 'C';
    private final static char CLIENTE_ESPECIAL = 'E';
    private static Boolean sairMain = false;
    public static void main(String[] args){



        char tipoCliente;
        try {
            while (!sairMain) {
                System.out.println("Informe o tipo do cliente.");
                System.out.println("(E) para cliente especial ou (C) para cliente normal.");
                tipoCliente = sc.next().toUpperCase(Locale.ROOT).charAt(0);
                CriarConta(tipoCliente);


                switch (tipoCliente) {
                    case CLIENTE_COMUM:
                        MontarMenuClienteC();
                        break;
                    case CLIENTE_ESPECIAL:
                        MontarMenuClienteE();
                        break;
                    case 't':
                        break;
                    default:
                        System.out.println("Valor inválido. Saindo...");
                }
            }


        }catch (IOException ex){
            System.out.println("Erro: " + ex.getMessage());
        }

    }

    private static char MontarMenuClienteC() throws IOException {
        clear();
        Boolean sair = false;
        Boolean trocarConta = false;

        while (!sair){
            TextoMenu();
            switch (sc.nextInt()){
                case 1:
                    System.out.println("Valor max. mensalidade financiamento: " + clienteComum.Financiar());
                    System.in.read();
                    clear();
                    break;

                case 2:
                    System.out.println("Nome: " + clienteComum.nome);
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
                    System.out.println("Digite o valor para a transferencia: ");
                    double valorTransferir = sc.nextDouble();
                    if(valorTransferir > clienteComum.saldo) {
                        System.out.println("Saldo insuficiente.");
                        break;
                    }

                    System.out.println("Digite o CPF de destinatário.: ");
                    if(sc.next() != clienteEspecial.cpf){
                        System.out.println("CPF inválido.");
                        break;
                    }
                    clienteComum.Transferir(valorTransferir);
                    break;

                case 5:
                    System.out.println("Digite o valor do saque: ");
                    clienteComum.Sacar(sc.nextDouble());
                    clear();
                    break;

                case 6:
                    sair = true;
                    sairMain = false;
                    clear();
                    break;

                case 0:
                    sair = true;
                    sairMain = true;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Valor inexistente.");
                    break;
            }
        }

        if(!sairMain == true)
            return 't';
        else
            return clienteComum.tipoCliente;

    }

    private static char MontarMenuClienteE() throws IOException {
        clear();

        Boolean sair = false;
        while (!sair){
            TextoMenu();
            switch (sc.nextInt()){
                case 1:
                    System.out.println("Valor max. mensalidade financiamento: " + clienteEspecial.Financiar());
                    System.in.read();
                    clear();
                    break;

                case 2:
                    System.out.println("Nome: " + clienteEspecial.nome);
                    System.out.println("Saldo atual: " + clienteEspecial.ConsultarSaldo());

                    System.in.read();
                    clear();
                    break;

                case 3:
                    System.out.println("Digite o valor do depósito: ");
                    clienteEspecial.Depositar(sc.nextDouble());
                    clear();
                    break;

                case 4:
                    System.out.println("Digite o valor para a transferencia: ");
                    double valorTransferir = sc.nextDouble();
                    if(valorTransferir > clienteEspecial.saldo) {
                        System.out.println("Saldo insuficiente.");
                        System.in.read();
                        break;
                    }

                    System.out.println("Digite o CPF de destinatário: ");
                    String valor = sc.nextLine();
                    if(valor != clienteComum.cpf){
                        System.out.println("CPF inválido.");
                        System.in.read();
                        break;
                    }
                    clienteEspecial.Transferir(valorTransferir);
                    break;

                case 5:
                    System.out.println("Digite o valor do saque: ");
                    clienteEspecial.Sacar(sc.nextDouble());
                    clear();
                    break;

                case 6:
                    sair = true;
                    sairMain = false;
                    clear();
                    break;

                case 0:
                    sair = true;
                    sairMain = true;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Valor inexistente.");
                    break;
            }
        }

        if(!sairMain == true)
            return 't';
        else
            return clienteComum.tipoCliente;

    }

    private static void TextoMenu(){

        clear();
        System.out.println("=======================================");
        System.out.println("1 - Simular Financiamento");
        System.out.println("2 - Consultar Saldo");
        System.out.println("3 - Depositar");
        System.out.println("4 - Transferir");
        System.out.println("5 - Sacar");
        System.out.println("6 - Mudar tipo de conta");
        System.out.println("0 - Sair");
        System.out.println("=======================================");
    }

    private static void CriarConta(char tipoCliente){

        clear();

        if(((tipoCliente == CLIENTE_COMUM) && (clienteComum.nome != null) && (clienteComum.cpf != null)) ||
                ((tipoCliente == CLIENTE_ESPECIAL) && (clienteEspecial.nome != null) && (clienteEspecial.cpf != null))){
            return;
        }
        if(tipoCliente == CLIENTE_COMUM){

            clienteComum.tipoCliente = CLIENTE_COMUM;

            System.out.println("Digite seu nome: ");
            clienteComum.nome = sc.next();

            System.out.println("Digite seu CPF (sem pontuação): ");
            clienteComum.cpf = sc.next();

        } else if(tipoCliente == CLIENTE_ESPECIAL){
            clienteEspecial.tipoCliente = CLIENTE_ESPECIAL;

            System.out.println("Digite seu nome: ");
            clienteEspecial.nome = sc.next();

            System.out.println("Digite seu CPF (sem pontuação): ");
            clienteEspecial.cpf = sc.next();
        } else
            return;
    }

    private static void clear()
    {
        for(int i = 0; i < 25; i++)
            System.out.println("");
    }

}
