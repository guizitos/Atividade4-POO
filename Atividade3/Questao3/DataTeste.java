package Atividade3.Questao3;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data(2024, 06, 11);

        System.out.println("Primeira Data: ");
        data1.displayData();

        data1.setAno(2024);
        data1.setDia(21);
        data1.setMes(12);

        System.out.println("Data Alterada:");
        data1.displayData();
    }
}
