package AplicacaoBanco;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
    this.limite = limite;
    this.saldo = limite;
    this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compras){
        if(compras.getValor() > saldo){
            return false;
        }
        saldo = saldo - compras.getValor();
        this.compras.add(compras);
        return true;
    }
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }
    public List<Compra> getCompras(){
        return compras;
    }

}