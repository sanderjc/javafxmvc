package javafxmvc.model.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author mateus_de-oliveira
 */
public class Venda implements Serializable{
   private int cdVenda;
   private LocalDate data;
   private double valor;
   private boolean pago;
   private List<ItemDeVenda> itensDeVenda;
   private Cliente cliente;

    public Venda(int cdVenda, LocalDate data, double valor, boolean pago, List<ItemDeVenda> itensDeVenda, Cliente cliente) {
        this.cdVenda = cdVenda;
        this.data = data;
        this.valor = valor;
        this.pago = pago;
        this.itensDeVenda = itensDeVenda;
        this.cliente = cliente;
    }

    public Venda() {
    }

    public int getCdVenda() {
        return cdVenda;
    }

    public void setCdVenda(int cdVenda) {
        this.cdVenda = cdVenda;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean getPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public List<ItemDeVenda> getItensDeVenda() {
        return itensDeVenda;
    }

    public void setItensDeVenda(List<ItemDeVenda> itensDeVenda) {
        this.itensDeVenda = itensDeVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
    
}
