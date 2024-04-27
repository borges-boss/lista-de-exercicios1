package questao_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int countEvenNumbers(List<Integer> numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Digite 10 números inteiros: ");
        while (numbers.size() < 10) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();
        
        System.out.println("Quantidade de números pares: " + countEvenNumbers(numbers));
    }
}

