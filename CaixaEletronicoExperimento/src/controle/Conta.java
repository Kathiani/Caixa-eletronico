package controle;

public class Conta {

    Cliente cliente;
    private int num;
    private float vLimiteSaque;
    private float vLimiteDeposito;
    private float saldo;
    private float vSacado;

    public Conta(Cliente cliente, int num, float vLimiteSaque, float vLimiteDeposito, float saldo) {
        this.cliente = cliente;
        this.num = num;
        this.vLimiteSaque = vLimiteSaque;
        this.vLimiteDeposito = vLimiteDeposito;
        this.saldo = saldo;
        this.vSacado = 0; //Atributo que armazena a quantia de dinheiro sacada por dia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getvLimiteSaque() {
        return vLimiteSaque;
    }

    public void setvLimiteSaque(float vLimiteSaque) {
        this.vLimiteSaque = vLimiteSaque;
    }

    public float getvLimiteDeposito() {
        return vLimiteDeposito;
    }

    public void setvLimiteDeposito(float vLimiteDeposito) {
        this.vLimiteDeposito = vLimiteDeposito;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getvSacado() {
        return vSacado;
    }

    public void setvSacado(float vSacado) {
        this.vSacado = vSacado;
    }

}
