package controle;

import java.io.IOException;
import java.util.Scanner;

import teste.CaixaTeste;

public class Principal {

    static Conta minhaConta = null;

    public static void main(String args[]) throws IOException {
        CaixaEletronico caixa = new CaixaEletronico();
        Scanner input = new Scanner(System.in);
        int opcao;
        String continuar = "s";
        float vAtualSaldo;  //  Valor do saldo em conta;
        float vCaixa;  // Valor atual do caixa;
        String resDeposito; // Resposta do sistema ao dep�sito;
        int numConta = 0;
        CaixaTeste teste = new CaixaTeste();

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Por favor, selecione uma op��o!");
            System.out.println("********************************");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Caixa");
            System.out.println("3 - Realizar Dep�sito");
            System.out.println("4 - Realizar Saque");
            System.out.println("********************************");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    while (minhaConta == null) {
                        System.out.println("Por favor, digite o n�mero da conta: ");
                        numConta = input.nextInt();
                        minhaConta = caixa.validarConta(numConta);
                        if (minhaConta == null) {
                            System.out.println("Conta inexistente. Digite outra conta!");
                        }
                    }
                    vAtualSaldo = caixa.consultarSaldoConta(minhaConta);
                    System.out.println("\n*O valor do saldo �: " + String.valueOf(vAtualSaldo));
                    break;
                case 2:
                    vCaixa = caixa.getvCaixa();
                    System.out.println("\n* O valor atual do caixa �: " + vCaixa);
                    break;
                case 3:
                    while (minhaConta == null) {
                        System.out.println("Por favor, digite o n�mero da conta: ");
                        numConta = input.nextInt();
                        minhaConta = caixa.validarConta(numConta);
                        if (minhaConta == null) {
                            System.out.println("Conta inexistente. Digite outra conta!");
                        }
                    }
                    System.out.println("Digite o valor do dep�sito: ");
                    float deposito = input.nextFloat();
                    resDeposito = caixa.deposito(minhaConta, deposito);
                    System.out.println(resDeposito);
                    break;
                case 4:
                    while (minhaConta == null) {
                        System.out.println("Por favor, digite o n�mero da conta: ");
                        numConta = input.nextInt();
                        minhaConta = caixa.validarConta(numConta);
                        if (minhaConta == null) {
                            System.out.println("Conta inexistente. Digite outra conta!");
                        }
                    }
                    System.out.println("Digite o valor do saque:");
                    float saque = input.nextFloat();
                    teste.testSaque(minhaConta, saque);
                   // System.out.println(caixa.saque(minhaConta, saque));
                    break;
                default:
                    System.out.println("Essa n�o � uma op��o v�lida. Digite n�meros de 1 a 4!");

            }

            System.out.println("\nDeseja continar (s/n): ");
            continuar = input.next();

        }

        System.out.println("Opera��o finalizada!");
        input.close();

    }
}
