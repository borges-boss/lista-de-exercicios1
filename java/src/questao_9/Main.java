package questao_9;

import java.util.Scanner;

public class Main {
    
    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("O fatorial de " + number + " é: " + factorial(number));
    }
}

