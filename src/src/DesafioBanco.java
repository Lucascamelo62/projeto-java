import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoInicial = 2500;
        double saldoFinal = saldoInicial;
        int op = 0;

        while (op != 4) {
            System.out.println("***************************************");
            System.out.println("Dados iniciais do cliente:\n");
            System.out.println("Nome: Lucas Silva Camelo");
            System.out.println("Tipo de Conta: Conta Corrente");
            System.out.println(String.format("Saldo Inicial: %.2f", saldoInicial));
            System.out.println("***************************************");

            System.out.println("Operações\n");
            System.out.println("1 - Consulta Saldo");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair\n");

            System.out.printf("Digite a opção desejada: ");
            op = sc.nextInt();
            if (op < 1 || op > 4) {
                System.out.println("Opção inválida!");
            }
            if (op == 1) {
                System.out.println(String.format("Saldo Final: %.2f", saldoFinal));
            } else if (op == 2) {
                System.out.printf("Informe o valor que deseja receber: ");
                double receberValor = sc.nextDouble();
                if (receberValor < 0) {
                    System.out.println("Digite um valor correto");
                } else {
                    saldoFinal += receberValor;
                }
            } else if (op == 3) {
                System.out.printf("Informa o valor que deseja transferir: ");
                double transferirValor = sc.nextDouble();
                if (transferirValor > saldoFinal) {
                    System.out.println("Saldo insuficiente");
                }
            }
        }

        sc.close();
    }
}
