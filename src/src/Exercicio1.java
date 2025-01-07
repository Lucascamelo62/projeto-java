import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Identificador de número POSITIVO ou NEGATIVO. Para sair, digite");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("POSITIVO");
        } else if (n < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("ZERO");
        }
    }
}
