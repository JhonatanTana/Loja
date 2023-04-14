package loja;
public class Pessoa {
    private String nome;
    private String dataDeNascimento;
    private Cliente cliente;
       
    public Pessoa (Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void Pessoa(String nome, String dataDeNascimento){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getDataDeNasciemnto() {
        return dataDeNascimento;
    }
    
}
