package loja;
public class Cliente {
    private int id;
    private Pessoa pessoa;
    private Endereço endereco;
    private Telefone telefone;
    
    public Cliente (Pessoa pessoal) {
        this.pessoa = pessoa;
    }
        public Cliente (Endereço endereco) {
        this.endereco = endereco;
    }
        public Cliente (Telefone telefone) {
        this.telefone = telefone;
    }
    
    public void Cliente(int id){
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
}
