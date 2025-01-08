import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeCliente, tipoConta;
        nomeCliente = "Lucas Camelo";
        tipoConta = "Conta Corrente";
        double saldoInicial, saldoFinal;
        saldoInicial = 2500;
        saldoFinal = saldoInicial;
        int op = 0;
        String menu = """
                Operações
                1 - Consulta Saldo
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                """;

        while (op != 4) {
            System.out.println("***************************************");
            System.out.println("Dados iniciais do cliente:\n");
            System.out.println(String.format("Nome do Cliente: %s", nomeCliente));
            System.out.println(String.format("Tipo de Conta: %s", tipoConta));
            System.out.println(String.format("Saldo Inicial: %.2f", saldoInicial));
            System.out.println("***************************************");

            System.out.println(menu);
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
