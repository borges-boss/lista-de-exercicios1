package questao_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        double number = scanner.nextDouble();
        scanner.close();
        
        for (int n = 0; n <= 100; n++) {
            System.out.println(number + " x " + n + " = " + (number * n));
        }
    }
}

