package SistemaDeVendas;

import java.time.LocalDate;

public class Compra {
    private Produto[] produtos;
    private LocalDate data;
    private Cliente cliente;
    private TipoCompra tipo;
    private LocalDate dataPagamento;
    private double valorTotal;
    public boolean paga;

    public Compra(Produto[] produtos, LocalDate data, Cliente cliente, TipoCompra tipo, LocalDate dataPagamento, double
            valorTotal, boolean paga) {
        this.produtos = produtos;
        this.data = data;
        this.cliente = cliente;
        this.tipo = tipo;
        this.dataPagamento = dataPagamento;
        this.valorTotal = valorTotal;
        this.paga = paga;
    }

    public Produto[] getProduto() {
        return produtos;
    }

    public LocalDate getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoCompra getTipo() {
        return tipo;
    }

    public void setTipo(TipoCompra tipo) {
        this.tipo = tipo;
    }
    public LocalDate getDataPagamento(){
        return  dataPagamento;
    }
    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    public double getValorTotal(){
        return valorTotal;
    }
    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }
    public boolean isPaga(){
        return paga;
    }
    public void setPaga(boolean paga){
        this.paga = paga;
    }
    public enum TipoCompra {AVISTA, APRASO}

    public void ImprimirCompra() {
        System.out.println("Produto: " + this.produtos);
        System.out.println("Data de compra: " + this.data);
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Tipo de compra: " + this.tipo);
    }
}
