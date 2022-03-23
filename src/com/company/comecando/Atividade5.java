package com.company.comecando;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de metros: ");
        double metros = scanner.nextDouble();
        double mutiplicacao = 100;
        double centimetro = metros * mutiplicacao;
        System.out.println("Seu Total de Centimetros é: " + centimetro);
        scanner.close();

    }
}
