package com.henrique.test;

public class Statement {
    public static void main(String[] args) {

        /*
        > MAIOR QUE
        < MENOS QUE
        >= MAIOR QUE OU IGUAL A
        <= MENOR QUE OU IGUAL A
        == IGUAL A
        != DIFERENTE DE
        && E
        || OU

         */


            String mensagem01 = "Parabéns você ganhou um bolo!";
            String mensagem02 = "Parabéns você ganhou um PS5!";
            int numero = 1;

            if (numero > 3) {
                System.out.println(mensagem02);
            } else if (numero < 3) {
                System.out.println(mensagem01);

            }

            if (15 == 5 || 10 == 10) { /* Caso eu use "&&" a sentença será falsa, porque
        verificará as duas afirmações se são verdadeiras ou não, caso uma não seja
        ela falha-rá. */
                System.out.println("Sucesso!"); // Mensagem caso a sentença for verdadeira
            } else {
                System.out.println("Falha!"); // Mensagem caso a sentença for falsa
            }

        }
    }