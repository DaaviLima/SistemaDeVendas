import java.time.LocalDate;

public class Fatura {
    private Conta conta;
    private LocalDate dataQuitacao;
    private float juros;
    private int quantidadeDeParcelas;
    private Parcela[] parcelas;

    public void jurosPorAtraso() {

        if (dataQuitacao.isAfter(conta.getDataVencimento())) {

            long diasAtraso = conta.getDataVencimento().until(dataQuitacao).getDays();


            float jurosAtraso = juros * diasAtraso;


            System.out.println("Juros por atraso: " + jurosAtraso);
        } else {
            System.out.println("Não há juros por atraso.");
        }
    }

    public void jurosPorParcelamento() {

        if (quantidadeDeParcelas > 1) {

            float jurosParcelamento = juros * quantidadeDeParcelas;


            System.out.println("Juros por parcelamento: " + jurosParcelamento);
        } else {
            System.out.println("Não há juros por parcelamento.");
        }
    }
}
