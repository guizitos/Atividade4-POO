package Atividade3.Questao1;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("233", "Computador Lenovo", 1, 3500);

        System.out.println("Número da Fatura: " + fatura.getNumero());
        System.out.println("Descrição/Nome do produto: " + fatura.getDescricao());
        System.out.println("Quantidade comprada: " + fatura.getQuantcomprada());
        System.out.println("Preço do Item: " + fatura.getPrecoitem());

    }
}
