package com.company;

public class Main {

    public static void main(String[] args) {
        int m[][] = new int[10][10];

        try {
            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j <= 9; j++) {
                    m[i][j] = (int)(Math.random() * 10);
                }
            }

            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 3; j++) {
                    System.out.println("| [" + (i + 1) + "] [" + (j + 1) + "] | = " + m[i][j]);
                }
            }

            //caso para dar erro
            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j <= 11; j++) { //mudar para <= 10 para dar o erro
                    m[i][j] = (int)(Math.random() * 10);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nPosição inexistente do vetor");
        }
    }
}
