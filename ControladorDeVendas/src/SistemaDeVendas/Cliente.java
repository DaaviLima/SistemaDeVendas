package SistemaDeVendas;

public class Cliente {
    private String nome;
    private String[] endereco;
    private double limiteDeCredito;
    private double limiteDeCompras;

    public Cliente(String nome, String[] endereco, double limiteDeCredito, double limiteDeCompras) {
        this.nome = nome;
        this.endereco = endereco;
        this.limiteDeCredito = limiteDeCredito;
        this.limiteDeCompras = limiteDeCompras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getEndereco() {
        return endereco;
    }

    public void setEndereco(String[] endereco) {
        this.endereco = endereco;
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    public double getLimiteDeCompras() {
        return limiteDeCompras;
    }

    public void setLimiteDeCompras(double limiteDeCompras) {
        this.limiteDeCompras = limiteDeCompras;
    }

    public boolean podeComprar(double valorTotal) {
        return valorTotal <= limiteDeCredito;
    }

    public void imprimirCliente() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Endereço:" + this.endereco);
        System.out.println("Limite de crédito:" + this.limiteDeCredito);
        System.out.println("Limite de compras:" + this.limiteDeCompras);
    }
}

