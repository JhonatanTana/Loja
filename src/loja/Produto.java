package loja;
public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    
    public void Produto(String nome, String descricao, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
}

