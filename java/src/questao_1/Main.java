import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int sumAll(List<Integer> numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Digite 10 numeros inteiros: ");
        while (numbers.size() < 10) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();

        System.out.println(sumAll(numbers));
    }
}
