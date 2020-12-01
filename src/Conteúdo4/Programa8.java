package Conteúdo4;

import java.util.Scanner;

public class Programa8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro maior que 1: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++ ){
            System.out.println("O número é: " + i);
        }
    }
}
