package br.padda;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Uso: java PasswordGenerator <comprimento_da_senha>");
            System.exit(1);
        }

        int length = Integer.parseInt(args[0]);

        String password = generatePassword(length);

        System.out.println("Senha gerada: " + password);
        System.out.println("Pressione Enter para copiar a senha para a área de transferência");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        copyToClipboard(password);
        System.out.println("Senha copiada para a área de transferência.");
    }

    private static String generatePassword(int length) {
        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+{}[]|:;<>,.?/~";
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charset.length());
            password.append(charset.charAt(index));
        }
        return password.toString();
    }

    private static void copyToClipboard(String text) {
        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
}

