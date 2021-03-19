package com.company;

import com.company.aula02.Aluno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome:");
        aluno.nome = scanner.nextLine();
        System.out.println("Digite a primeira nota: ");
        aluno.nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        aluno.nota2 = scanner.nextDouble();

        System.out.println("A media de " + aluno.nome + " é " + aluno.calcularMeida());

    }
}
