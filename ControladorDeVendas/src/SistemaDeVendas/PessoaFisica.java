package SistemaDeVendas;

import java.time.LocalDate;

public class PessoaFisica extends Cliente {
    private String cpf;
    public LocalDate dataNascimento;

    public PessoaFisica(String nome, String[] endereco, double limiteDeCredito, double limiteDeCompras, String cpf, LocalDate dataNascimento) {
        super(nome, endereco, limiteDeCredito, limiteDeCompras);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void ImprimirPessoaFisica() {
        System.out.println("CPF:" + this.cpf);
        System.out.println("Data de Nascimento:" + this.dataNascimento);
    }
}