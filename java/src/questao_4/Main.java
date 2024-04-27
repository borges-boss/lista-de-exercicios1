package questao_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import questao_4.Person;

public class Main {
    public static int findPeopleWithMoreThanNinetyKg(List<Person> people) {
        int count = 0;
        for (Person p : people) {
            if (p.getWeight() > 90) {
                count++;
            }
        }
        return count;
    }

    public static double calculateAgeAverage(List<Person> people) {
        int sum = 0;
        for (Person p : people) {
            sum += p.getAge();
        }
        return ((double) sum) / people.size();
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (people.size() < 7) {
            System.out.println("Digite a sua idade:");
            int age = scanner.nextInt();
            System.out.println("Digite o seu peso:");
            double weight = scanner.nextDouble();
            people.add(new Person(weight, age));
            System.out.println("\n----------------------");
            System.out.println("Informações salvas!");
            System.out.println("----------------------\n");
            System.out.println("Próximo!\n");
        }
        scanner.close();
        System.out.println("Quantidade de pessoas com mais de 90Kg: " + findPeopleWithMoreThanNinetyKg(people));
        System.out.println("A média de idades é: " + calculateAgeAverage(people));
    }
}
