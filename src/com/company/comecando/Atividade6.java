package com.company.comecando;

import java.util.Scanner;



public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o Raio do Circulo em cm: ");
        Double raio = scanner.nextDouble();
        Double raioaoquadrado = raio * raio;
        Double pi = 3.14;
        double area = raioaoquadrado * pi;
        System.out.println("A area total do circulo:" + area + "cm²");
        scanner.close();
    }
}
