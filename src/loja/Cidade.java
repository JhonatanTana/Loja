package loja;
public class Cidade {
    private String nome;
    private String estado;
    
    public void Cidade (String nome, String estado){
        this.nome = nome;
        this.estado = estado;
    }
    
        public String getNome() {
        return nome;
    }
        
        public String getEstado() {
        return estado;
    }
}
