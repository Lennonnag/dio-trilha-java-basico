package edu.lennon.operadores;

import javax.swing.text.StyledEditorKit.BoldAction;

public class operadores {
    public static void main(String[] args) {
        /* x repetição */
        // int numero = 5;
        // numero = numero + 1;
        // numero++; /*é a mesma coisa que numero + 1 */
        // System.out.println(numero);
        // boolean variavel = true;
        // variavel = !variavel; /*inverte o resultado */
        int a, b;
        a = 5;
        b = 6;

        /*
         * String resultado = "";
         * if (a == b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         * System.out.println(resultado);
         */
        boolean resultado = a == b ? true : false; /* Operador ternario -> ?: <- */
        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;
        System.out.println("numero 1: " + numero1 + "\nnumero 2: " + numero2);
        boolean simNao = numero1 == numero2;
        System.out.println("numero 1 é igual? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero 1 é diferente? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero 1 é maior? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numero 1 é menor? " + simNao + "\n\n\n");

        String nome1 = "Lennon";
        String nome2 = new String("Lennon");
        System.out.println(nome1.equals(nome2)); // Utiliza-se "equals" para comparar conteúdo.

        /*
         * OPERADORES LÓGICOS
         * && OPERADOR LÓGICO "E"
         * || OPERADOR LÓGICO "OU"
         */
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("\n \nAs duas condições são verdadeiras");
        }
        System.out.println("\n\nFim1");
        if (condicao1 || condicao2) {
            System.out.println("\n \nUma duas condições é verdadeiras");
        }
        System.out.println("\n\nFim2");

    }

}
