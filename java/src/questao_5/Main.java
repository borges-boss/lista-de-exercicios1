package questao_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    private int age;
    private double weight;
    private double height;

    public Person(double weight, int age, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}

public class Main {
    public static int findOlderThanFifty(List<Person> people) {
        int count = 0;
        for (Person p : people) {
            if (p.getAge() > 50) {
                count++;
            }
        }
        return count;
    }

    public static double heightAverageBetweenTenAndTwenty(List<Person> people) {
        List<Person> filteredList = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() >= 10 && p.getAge() <= 20) {
                filteredList.add(p);
            }
        }
        double sum = 0;
        for (Person p : filteredList) {
            sum += p.getHeight();
        }
        if(filteredList.size() > 0)
         return sum / filteredList.size();
        
        return 0;
    }

    public static double lessThanFortyKg(List<Person> people) {
        int count = 0;
        for (Person p : people) {
            if (p.getWeight() < 40) {
                count++;
            }
        }
        return (count * 100.0) / people.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        while (people.size() < 25) {
            System.out.print("Digite a sua idade: ");
            int age = scanner.nextInt();
            System.out.print("Digite o seu peso: ");
            double weight = scanner.nextDouble();
            System.out.print("Digite a sua altura: ");
            double height = scanner.nextDouble();
            people.add(new Person(weight, age, height));
            System.out.println("\n----------------------");
            System.out.println("Informações salvas!");
            System.out.println("----------------------\n");
            System.out.println("Proximo!\n");
        }

        scanner.close();

        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + findOlderThanFifty(people));
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + heightAverageBetweenTenAndTwenty(people));
        System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos entre todas as analisadas: " + lessThanFortyKg(people));
    }
}

