package questao_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Double> findEvenNumbers(List<Double> numbers) {
        List<Double> evenNumbers = new ArrayList<>();
        for (Double n : numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }
        return evenNumbers;
    }

    public static List<Double> findOddNumbers(List<Double> numbers) {
        List<Double> oddNumbers = new ArrayList<>();
        for (Double n : numbers) {
            if (n % 2 != 0) {
                oddNumbers.add(n);
            }
        }
        return oddNumbers;
    }

    public static List<Double> findNumbersDivisibleByThree(List<Double> numbers) {
        List<Double> divisibleByThree = new ArrayList<>();
        for (Double n : numbers) {
            if (n % 3 == 0) {
                divisibleByThree.add(n);
            }
        }
        return divisibleByThree;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        System.out.println("Digite 10 numeros:");
        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextDouble());
        }
        scanner.close();

        List<Double> evenNumbers = findEvenNumbers(numbers);
        List<Double> oddNumbers = findOddNumbers(numbers);
        List<Double> divisibleByThree = findNumbersDivisibleByThree(numbers);

        double sumEven = 0;
        for (double n : evenNumbers) {
            sumEven += n;
        }
        double sumOdd = 0;
        for (double n : oddNumbers) {
            sumOdd += n;
        }
        double sumDivisibleByThree = 0;
        for (double n : divisibleByThree) {
            sumDivisibleByThree += n;
        }

        System.out.println("Soma dos numeros pares: " + sumEven);
        System.out.println("Soma dos numeros impares: " + sumOdd);
        System.out.println("Soma dos numeros divisiveis por tres: " + sumDivisibleByThree);
    }
}

