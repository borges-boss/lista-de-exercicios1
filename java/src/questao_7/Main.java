package questao_7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Numeros entre 1000 e 2000 que quando divididos por 5 produzam resto 3");
        
        for (int n = 1000; n < 2000; n++) {
            if (n % 5 == 3) {
                System.out.println(n);
            }
        }
    }
}
