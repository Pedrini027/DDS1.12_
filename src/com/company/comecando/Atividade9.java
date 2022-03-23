package com.company.comecando;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a Temperatura em Fahrenheit: ");
        Double fahrenheit = scanner.nextDouble();
        Double celsius = (fahrenheit-32) * 5/9;
        System.out.println("O Valor de Graus Celsius é: " + celsius);
        scanner.close();
    }
}
