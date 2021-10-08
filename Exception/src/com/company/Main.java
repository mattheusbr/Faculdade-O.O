package com.company;

public class Main {

    public static void main(String[] args) {
	    int numerador[] = {4,8,16,32,64,128,256,512};
	    int denominador[] = {3,0,4,4,0,8};
	    for (int i =0; i < numerador.length; i++){
	        try {
	            if(numerador[i] % denominador[i] != 0){
	                throw new NaoInteiro(numerador[i], denominador[i]);
                }else {
	                System.out.println(numerador[i] + "/" + denominador[i] + "="
	                                + (numerador[i] / denominador[i]));
                }
            }catch (ArithmeticException e){
	            System.out.println("Não é divisivel por 0");
            }catch (ArrayIndexOutOfBoundsException e){
	            System.out.println("Indice fora da faixa do vetor");
            }catch (NaoInteiro e){
	            System.out.println(e.toString());
            }
        }


    }
}
