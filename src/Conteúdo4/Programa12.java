package Conteúdo4;

import java.util.Scanner;

public class Programa12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= numero; i++){
            soma = soma + i;

        }
        System.out.println(soma);
    }
}
