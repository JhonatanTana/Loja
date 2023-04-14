package loja;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String dataDeCriacao;
    private String status;
    private Cliente cliente;
    private PedidoItem pedidoitem;
    private List<Produto> itens;
    
    public String getDataDeCriacao() {
        return dataDeCriacao;
    }
    
    public String getStatus() {
        return status;
    }
    
    public Pedido(Cliente cliente){
        this.cliente = cliente;
        itens = new ArrayList<>();
    }
    
    public Pedido(PedidoItem pedidoitem){
        this.pedidoitem = pedidoitem;
    }

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void addItens(Produto produto) {
        itens.add(produto);
    }
    
    public Produto removeItens(Produto produto) {
        if (itens.contains(produto)){
            itens.remove(produto);
            return produto;
        } else {
            return null;
        }
    }
    
    public double calculaValorTotal() {
        double valorTotal = 0.0;
        for (Produto produto : itens) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }
}