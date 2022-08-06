public class Cliente {
    
    private String nomeCliente;
    private String cpf;
    private String contato;
    
    public Cliente(String nomeCliente, String cpf, String contato) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.contato = contato;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "\t" + nomeCliente + "\t\t\t" + cpf + "\t\t\t" + contato;
    }
    
}
