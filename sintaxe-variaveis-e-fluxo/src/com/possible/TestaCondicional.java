package com.possible;

public class TestaCondicional {

    public static void main(String[] args) {

        System.out.println("testando condicionais");

        int idade = 16;
        int quantidadePessoa = 1;

        if(idade >= 18){
            System.out.println("Você tem mais de 18 anos");
            System.out.println("Seja bem vinda");
        } else {
            if(quantidadePessoa >= 2) {
                System.out.println("Você não tem 18, mas pode entrar, " +
                        "pois está acompanhado");
            } else {

                System.out.println("Infelizmente você não pode entrar");

            }
        }
    }

}
