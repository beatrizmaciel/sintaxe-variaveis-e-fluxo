package com.possible;

public class TestaCaracteres {

    public static void main(String[] args) {

        // char guarda só um caracter com aspas simples
        char letra = 'a';

        System.out.println(letra);

        // tabela ASCII
        char valor = 65;

        // usamos o (char) pra dizer pro java o tipo
        // do objeto
        valor = (char) (valor + 1);

        System.out.println(valor);

        String palavra = "primeiro teste de string";

        System.out.println(palavra);

    }

}
