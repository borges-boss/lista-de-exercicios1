package questao_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static double findGreaterNumber(List<Double> numbers) {
        double greaterNumber = 0;
        for (double number : numbers) {
            if (greaterNumber < number) {
                greaterNumber = number;
            }
        }
        return greaterNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        
        System.out.println("Digite 5 numeros:");
        int count = 0;
        while (count < 5) {
            numbers.add(scanner.nextDouble());
            count++;
        }

        scanner.close();
        
        System.out.println("O maior numero é: " + findGreaterNumber(numbers));
    }
}
