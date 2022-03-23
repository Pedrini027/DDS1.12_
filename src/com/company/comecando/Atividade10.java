package com.company.comecando;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a Temperatura em Celsius: ");
        Double celcius = scanner.nextDouble();
        Double fahrenheit = (celcius * 9/5) + 32;
        System.out.println("O Valor de Graus Fahrenheit é: " + fahrenheit);
        scanner.close();
    }
}
