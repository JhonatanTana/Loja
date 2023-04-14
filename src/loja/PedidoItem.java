package loja;
public class PedidoItem {
    private int quantidade;
    private double subtotal;
    private Produto produto;
    
    public PedidoItem(Produto produto) {
        this.produto = produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public double getSubtotal() {
        return subtotal;
    }
    
}
