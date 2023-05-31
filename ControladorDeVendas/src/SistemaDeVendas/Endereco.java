package SistemaDeVendas;

public class Endereco {
    private String logradouro, numero, bairro, municipio, estado, cep;

    public Endereco(String logradouro, String numero, String bairro, String municipio, String estado, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void imprimirEndereco() {
        System.out.println("Logradouro:" + this.logradouro);
        System.out.println("Numero:" + this.numero);
        System.out.println("Bairro:" + this.bairro);
        System.out.println("Municipio:" + this.municipio);
        System.out.println("Estado:" + this.estado);
        System.out.println("Cep:" + this.cep);
    }
}
