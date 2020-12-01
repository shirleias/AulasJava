package Conteúdo4;

import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }
}
