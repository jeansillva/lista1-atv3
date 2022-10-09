import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Peça dois números:
        System.out.print("Entre com o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Entre com o segundo número: ");
        double n2 = sc.nextDouble();
        sc.close();
        // Imprima a soma
        double soma = n1 + n2;
        System.out.println("A soma dos números é " + soma);
    }
}
