package loja;
public class Endereço {
    private String rua;
    private String numero;
    private Cidade cidade;
    
    public Endereço (Cidade cidade) {
        this.cidade = cidade;
    }
    
    public void Endereço(String rua, String numero){
        this.rua = rua;
        this.numero = numero;
    }
    
    public String getRua() {
        return rua;
    }
    
    public String getNumero() {
        return numero;
    }
}
