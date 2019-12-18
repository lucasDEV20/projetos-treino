/*
 Faça um programa que leia um valor e apresente o número de 
 Fibonacci correspondente a este valor lido. 
 Lembre que os 2 primeiros elementos da série de 
 Fibonacci são 0 e 1 e cada próximo termo
 é a soma dos 2 anteriores a ele. 
 Todos os valores de Fibonacci calculados 
 neste problema devem caber em
 um inteiro de 64 bits sem sinal.

 Entrada
 A primeira linha da entrada contém um inteiro T,
 indicando o número de casos de teste. 
 Cada caso de teste contém um único 
 inteiro N (0 ≤ N ≤ 60), 
 correspondente ao N-esimo termo da série de Fibonacci.

 Saída
 Para cada caso de teste da entrada,
 imprima a mensagem 
 "Fib(N) = X",
 onde X é o N-ésimo termo da série de Fibonacci.
 */
package uri_lab;

import java.util.Scanner;

public class x1176 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T, N;
        long a, b, c;
        a = 0;
        b = 1;
        c = 0;
        long fib[] = new long[61];
        for (int i = 0; i < fib.length; i++) {
            fib[i] = c;
            a = b;
            b = c;
            c = a + b;

        }
        T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            N = scan.nextInt();
            System.out.println("Fib(" + N + ") = " + fib[N]);
        }

    }

}
