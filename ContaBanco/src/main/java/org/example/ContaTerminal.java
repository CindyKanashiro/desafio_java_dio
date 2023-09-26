package org.example;

import java.util.Scanner;

public class ContaTerminal {

    private int numero;
    private String numeroAgencia;
    private String nome;
    private Double saldo;

    public ContaTerminal(int numero, String numeroAgencia, String nome, double saldo) {
        this.numero = numero;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o número");
         int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome");
         String nome = scannerString.nextLine();

        System.out.println("Por favor, digite o saldo");
        Double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                " conta %d e seu saldo %.2f já está disponível para saque%n", nome, numeroAgencia, numero, saldo);
    }


}