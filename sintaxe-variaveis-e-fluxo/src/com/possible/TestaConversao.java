package com.possible;

public class TestaConversao {

    public static void main(String[] args) {

        double salario = 1270.50;
        // usamos o (int) antes da variável pra transformar
        // ela em int. Chamamos isso de casting.
        int valor = (int) salario;

        System.out.println(valor);

        // long, int, short e byte
        long numeroGrande = 8432974823L;
        short valorPequeno = 2131;
        byte b = 127;

        // float, precisamos botar f no final

        float pontoFlutuante = 3.14f;

        //  problemas de double

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);

    }

}
