package com.possible;

public class TestaEscopo {

    public static void main(String[] args) {

        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoa = 3;
        boolean acompanhado;

        if(quantidadePessoa >= 2){
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("Valor de acompanhado " + acompanhado);

        if (idade >= 18 && acompanhado){
            System.out.println("Seja bem vinda");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}
