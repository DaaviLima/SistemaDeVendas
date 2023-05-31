package SistemaDeVendas;

public class Produto {
    private String produto, codigoDeBarras;
    private double preco;

    public Produto(String produto, String codigoDeBarras, double preco) {
        this.produto = produto;
        this.codigoDeBarras = codigoDeBarras;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimirDados() {
        System.out.println("Produto:" + this.produto);
        System.out.println("Codigo de Barras:" + this.codigoDeBarras);
        System.out.println("Preço:" + this.preco);

    }
}