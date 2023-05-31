package SistemaDeVendas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conta {
    private List<Compra> comprasAVista;
    private List<Compra> comprasAPrazo;
    private LocalDate dataVencimento;
    private double total;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.comprasAVista = new ArrayList<>();
        this.comprasAPrazo = new ArrayList<>();
    }

    public Conta(List<Compra> compras, LocalDate dataVencimento, double total, Cliente cliente){
        this.total = total;
        this.cliente = cliente;
        this.comprasAVista = new ArrayList<>();
        this.comprasAPrazo = new ArrayList<>();

        for(Compra compra : compras){
            if(compra.getTipo() == Compra.TipoCompra.AVISTA){
                this.comprasAVista.add(compra);
            } else if(compra.getTipo() == Compra.TipoCompra.APRASO){
                if(this.dataVencimento == null) {
                    this.dataVencimento = compra.getData().plusDays(5);
                }
                if(this.comprasAPrazo.size() < cliente.getLimiteDeCredito()){
                    this.comprasAPrazo.add(compra);
                }
            }
        }

        calcularTotal();
    }

    public void pagarConta(LocalDate dataPagamento){
        if(contaVencida()){
            System.out.println("A conta está vencida.");
            return;
        }

        for(Compra compra : comprasAPrazo){
            if(!compra.isPaga()){
                compra.setPaga(true);
                compra.setDataPagamento(dataPagamento);
            }
        }
    }

    private boolean contaVencida(){
        return dataVencimento != null && dataVencimento.isBefore(LocalDate.now());
    }

    private void calcularTotal(){
        double totalAVista = 0;
        double totalAPrazo = 0;

        for(Compra compra : comprasAVista){
            totalAVista += compra.getValorTotal();
        }

        for(Compra compra : comprasAPrazo){
            if(!compra.isPaga()){
                totalAPrazo += compra.getValorTotal();
            }
        }

        this.total = totalAVista + totalAPrazo;
    }

    public List<Compra> getComprasAVista(){
        return comprasAVista;
    }

    public void setComprasAVista(List<Compra> comprasAVista){
        this.comprasAVista = comprasAVista;
    }

    public List<Compra> getComprasAPrazo(){
        return comprasAPrazo;
    }

    public void setComprasAPrazo(List<Compra> comprasAPrazo){
        this.comprasAPrazo = comprasAPrazo;
    }

    public LocalDate getDataVencimento(){
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento){
        this.dataVencimento = dataVencimento;
    }

    public double getTotal(){
        return total;
    }

    public void setTotal(double total){
        this.total = total;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
}
