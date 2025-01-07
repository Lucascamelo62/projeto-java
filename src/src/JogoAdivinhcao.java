import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jogo de Adivinhação: Tente adivinhar em até 5 tentativas o número entre 0 e 10");
        for (int i = 1; i <= 10 ; i++) {
            int randomico = new Random().nextInt(10);
            System.out.printf("Tentativa %d: ", i);
            int tentativa = sc.nextInt();
            if (tentativa == randomico) {
                System.out.println("Parabéns, acertou!!!");
            } else {
                System.out.println(String.format("Que pena... tente novamente ): O valor correto era: %d", randomico));
            }
        }

        sc.close();
    }
}
