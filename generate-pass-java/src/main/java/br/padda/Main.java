package br.padda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o tamanho da senha desejada:");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        if (length < 12) {
            System.out.println("Muito curta.");
            System.exit(1);
        }

        PasswordGenerator.main(new String[]{String.valueOf(length)});
    }
}

