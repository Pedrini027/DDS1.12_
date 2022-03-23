package com.company.comecando;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        Double altura = scanner.nextDouble();
        Double pesoideal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoideal);
        scanner.close();
    }
}
