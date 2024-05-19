package controle;

public class CaixaEletronico {

    String msgDoCaixa = null;
    float vCaixa;

    public CaixaEletronico() {
        this.vCaixa = 15000;	 //Quantia de dinheiro em caixa;
    }

    public float getvCaixa() {
        return vCaixa;
    }

    public void setvCaixa(float vCaixa) {
        this.vCaixa = vCaixa;
    }

    public Conta validarConta(int numConta) {
        Banco banco = new Banco();

        int i = 0;
        int n = banco.contas.size();
        while (i < n) {
            if (numConta == banco.contas.get(i).getNum()) {
                return banco.contas.get(i);
            }

            i++;
        }
        return null;
    }

    public float consultarSaldoConta(Conta conta) {

        float saldoConta;
        saldoConta = conta.getSaldo();
        return saldoConta;

    }

    public String deposito(Conta conta, float deposito) {

        if (validarDeposito(conta, deposito)) // Aplicar regras de neg�cio e fluxos alternativos
        {
            float saldoAnterior = conta.getSaldo();
            conta.setSaldo(saldoAnterior + deposito);
            msgDoCaixa = "Dep�sito realizado com sucesso!";
            return msgDoCaixa;
        }
        return msgDoCaixa;

    }

    private boolean validarDeposito(Conta conta, float deposito) {
        if (deposito <= 0) {
            msgDoCaixa = "Valor inv�lido. Digite um valor maior que zero!";
            return false;
        }

        if (conta.getvLimiteDeposito() < deposito) {
            msgDoCaixa = "Valor acima do limite di�rio de dep�sito!";
            return false;
        }

        return true;
    }

    public String saque(Conta minhaConta, float saque) {
        if (minhaConta.getSaldo() < saque) {
            msgDoCaixa = "Saldo insuficiente. Digite outro valor";
        } else if (saque <= 0) {
            msgDoCaixa = "Valor invalido! Digite outro valor!";
        } else if (minhaConta.getvSacado() > minhaConta.getvLimiteSaque()) {
            msgDoCaixa = "A quantia solicitada esta fora do limite diario de saque!";
        } else if (vCaixa < saque) {
            msgDoCaixa = "O valor não pode ser pago. Digite outro valor!";
        } else {
            minhaConta.setvSacado(minhaConta.getvSacado() + saque);
            minhaConta.setSaldo(minhaConta.getSaldo() - saque);
            msgDoCaixa = "Saque efetuado com sucesso";
        }
        return msgDoCaixa;

    }

}
