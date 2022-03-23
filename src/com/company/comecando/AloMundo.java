package com.company.comecando;

import java.util.Scanner;

public class AloMundo {
    public static void main(String[] args) {
        System.out.println("Ola MUndo");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: " );
        Double numero = scanner.nextDouble();
        System.out.println("Seu Numero informado é: " + numero);

    }
}
