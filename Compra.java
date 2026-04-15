package AplicacaoBanco;

public class Compra implements Comparable<Compra> {
    //Atributo
    private String descricao;
    private double valor;

    //Metodo
    Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra: descricao = " + descricao +
                " - R$ " + valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
    //Metodo
    @Override
    public int compareTo(Compra outra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outra.valor));
    }
}