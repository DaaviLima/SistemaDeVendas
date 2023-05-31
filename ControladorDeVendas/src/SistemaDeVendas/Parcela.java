package SistemaDeVendas;

import java.time.LocalDate;

public class Parcela {
    private LocalDate dataVencto;
    private double valor;
    private float juros;
    private TipoParcela tipoParcela;
    private LocalDate dataPagto;

    public Parcela(LocalDate dataVencto, double valor, float juros, TipoParcela tipoParcela, LocalDate dataPagto){
        this.dataVencto = dataVencto;
        this.valor = valor;
        this.juros = juros;
        this.tipoParcela = tipoParcela;
        this.dataPagto = dataPagto;
    }

    public LocalDate getDataVencto(){
        return dataVencto;
    }

    public void setDataVencto(LocalDate dataVencto){
        this.dataVencto = dataVencto;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public float getJuros(){
        return juros;
    }

    public void setJuros(float juros){
        this.juros = juros;
    }

    public TipoParcela getTipoParcela(){
        return tipoParcela;
    }

    public void setTipoParcela(TipoParcela tipoParcela){
        this.tipoParcela = tipoParcela;
    }

    public LocalDate getDataPagto(){
        return dataPagto;
    }

    public void setDataPagto(LocalDate dataPagto){
        this.dataPagto = dataPagto;
    }
    enum TipoParcela {
        PARCELA_NORMAL,
        PARCELA_ESPECIAL
    }

    public void imprimirParcela(){
        System.out.println("Data de Vencimento: " + this.dataVencto);
        System.out.println("Valor: " + this.valor);
        System.out.println("Juros: " + this.juros);
        System.out.println("Tipo de Parcela: " + this.tipoParcela);
        System.out.println("Data de Pagamento: " + this.dataPagto);
    }
}
