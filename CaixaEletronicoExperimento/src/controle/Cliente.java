package controle;

public class Cliente {

    String nome;
    String email;

    public Cliente(String nomeCliente, String emailCliente) {
        this.nome = nomeCliente;
        this.email = emailCliente;
    }

    public String getnome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getemail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
