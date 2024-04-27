package questao_10;

import java.util.Scanner;

public class Main {

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("O numero " + (isPrimeNumber(number) ? "é primo" : "não é primo"));
    }
}

