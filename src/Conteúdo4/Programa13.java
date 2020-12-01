package Conteúdo4;

import java.util.Scanner;

public class Programa13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int multiplica = 1;
        for (int i = 1; i <= numero; i++){
            multiplica = multiplica * i;

        }
        System.out.println("O valor é: " + multiplica);
    }
}
///Fatorial