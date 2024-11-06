package Atividade3.Questao1;

public class Fatura {
    public String numero;
    public String descricao;
    public int quantcomprada;
    public double precoitem;

    public Fatura(String numero, String descricao, int quantcomprada, double precoitem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantcomprada = quantcomprada;
        this.precoitem = precoitem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantcomprada() {
        return quantcomprada;
    }

    public void setQuantcomprada(int quantcomprada) {
        this.quantcomprada = quantcomprada > 0 ? quantcomprada : 0;
    }

    public double getPrecoitem() {
        return precoitem;
    }

    public void setPrecoitem(double precoitem) {
        this.precoitem = precoitem > 0 ? precoitem : 0.0;
    }

    public double getTotalFatura() {
        return quantcomprada * precoitem;
    }

}
