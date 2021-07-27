package com.possible;

public class TestaCondicional2 {

    public static void main(String[] args) {

        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoa = 1;
        boolean acompanhado = true;

        if (idade >= 18 && acompanhado){
            System.out.println("Seja bem vinda");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}