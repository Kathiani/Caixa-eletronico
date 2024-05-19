package controle;

import java.util.ArrayList;

public class Banco {

    ArrayList<Conta> contas = new ArrayList<Conta>();

    public Banco() {
        Cliente cliente1 = new Cliente("Kathiani Souza", "kathiani@gmail.com");
        Cliente cliente2 = new Cliente("Fernando Souza", "fernando@gmail.com");
        Cliente cliente3 = new Cliente("Caio Santos", "caio@gmail.com");
        Conta conta1 = new Conta(cliente1, 238, 5000, 2000, 500); //cliente, n�mero da conta, limite de saque, limite de dep�sito, saldo em conta.
        Conta conta2 = new Conta(cliente2, 752, 5000, 2000, 10);
        Conta conta3 = new Conta(cliente3, 839, 5000, 2000, 1700);

        this.contas.add(conta1);
        this.contas.add(conta2);
        this.contas.add(conta3);
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

}
