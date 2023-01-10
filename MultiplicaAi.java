import java.util.Scanner;

public class MultiplicaAi {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("MultiplicaAí");
            System.out.println("======================");
            System.out.println("Escolha um numero para ser multiplicado: ");
            int numero = sc.nextInt();
            System.out.println("Tabela de multiplicação de " + numero);
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " * " + i + " = " + numero * i);
            }
        }
    }
}
