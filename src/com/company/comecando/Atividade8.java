package com.company.comecando;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto você recebe por hora? ");
        Double hora = scanner.nextDouble();
        System.out.print("Quantas Horas Você Trabalha por Mês? ");
        Double meshoras = scanner.nextDouble();
        Double salarioTotal = hora * meshoras;
        System.out.println("Seu Salário Mensal é R$:" + salarioTotal );
        scanner.close();
    }
}
