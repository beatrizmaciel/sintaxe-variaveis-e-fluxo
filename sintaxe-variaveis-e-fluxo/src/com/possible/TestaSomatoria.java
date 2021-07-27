package com.possible;

public class TestaSomatoria {

    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        while(contador <= 10) {
            // \/ total = total + contador;
            total += contador;
            // isso acima significa que ele soma ele
            // mesmo com o contador
            System.out.println(total);
            contador++;
        }

        System.out.println("Total final é " + total);
    }
}
