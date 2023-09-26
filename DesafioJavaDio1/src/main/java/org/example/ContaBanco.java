package org.example;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência");
        String numeroAgencia = scanner.nextLine();
        scanner.nextLine(); // Consuma a quebra de linha

        System.out.println("Por favor, digite o seu nome");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo");
        Double numeroSaldo = scanner.nextDouble();


    }
    @Override
    public String toString() {
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque",
                nome,);
    }
}
