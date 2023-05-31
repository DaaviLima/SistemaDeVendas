package SistemaDeVendas;

public class PessoaJuridica extends Cliente {
    private String cnpj, inscricaoEstadual;

    public PessoaJuridica(String nome, String[] endereco, double limiteDeCredito, double limiteDeCompras, String cnpj, String inscricaoEstadual) {
        super(nome, endereco, limiteDeCredito, limiteDeCompras);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void ImprimirPessoaJuridica() {
        System.out.println("CNPJ:" + this.cnpj);
        System.out.println("Inscrição Estadual: " + this.inscricaoEstadual);
    }
}
