package teste;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import controle.CaixaEletronico;
import controle.Conta;

public class CaixaTeste {

    public CaixaTeste() {
    }

    @AfterClass
    public static void cleanUp() {
        // ...
    }

    @BeforeClass
    public static void Init() {

    }

    /**
     * Testar o m�todo saque da classe CaixaEletronico
     *
     * @param saque
     */
    @Test
    public void testSaque(Conta minhaConta, float saque) {
        /*   CaixaEletronico caixa = new CaixaEletronico();
        String msg = caixa.saque(minhaConta, saque);
        Assert.assertEquals("Saque efetuado com sucesso", msg);*/
        /* CaixaEletronico caixa = new CaixaEletronico();
        String msg = caixa.saque(minhaConta, saque);
        Assert.assertEquals("Saldo insuficiente. Digite outro valor", msg);*/
        /*CaixaEletronico caixa = new CaixaEletronico();
        String msg = caixa.saque(minhaConta, saque);
        Assert.assertEquals("Valor invalido! Digite outro valor!", msg);*/
        /*CaixaEletronico caixa = new CaixaEletronico();
        String msg = caixa.saque(minhaConta, saque);
        Assert.assertEquals("O valor não pode ser pago. Digite outro valor!", msg);*/
        /*CaixaEletronico caixa = new CaixaEletronico();
        minhaConta.setvSacado(5001f);
        String msg = caixa.saque(minhaConta, saque);
        Assert.assertEquals("A quantia solicitada esta fora do limite diario de saque!", msg);*/
        //System.out.println(msg);
    }
}
